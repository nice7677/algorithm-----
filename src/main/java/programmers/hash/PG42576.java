package programmers.hash;

import java.util.Arrays;

/**
 * [프로그래머스 42576] 완주하지 못한 선수
 */
public class PG42576 {

    public String solution(String[] participant, String[] completion) {
        int i = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (String complete : completion) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
            i++;
        }
        return participant[i];
    }

}
