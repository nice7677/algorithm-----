package programmers.kakao.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Programmers 42888
 * 2019 KAKAO BLIND RECRUITMENT
 * 오픈채팅방
 */
public class PG42888 {

    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> idMap = new HashMap<>();
        List<String> recordList = new ArrayList<>();
        int i = 0;
        for (String s : record) {
            String action = "";
            String[] sSplit = s.split(" ");
            if (sSplit[0].equals("Enter")) {
                idMap.put(sSplit[1], sSplit[2]);
                action = " 님이 들어왔습니다.";
            } else if (sSplit[0].equals("Change")) {
                idMap.put(sSplit[1], sSplit[2]);
            } else if (sSplit[0].equals("Leave")) {
                action = " 님이 나갔습니다.";
            }
            i++;
            if (!sSplit[0].equals("Change")) {
                recordList.add(sSplit[1] + action);
            }
        }

        answer = new String[recordList.size()];
        i = 0;
        for (String s : recordList) {
            String[] sSplit = s.split(" ");
            answer[i] = idMap.get(sSplit[0]) + sSplit[1] + " " + sSplit[2];
            i++;
        }
        return answer;
    }

}
