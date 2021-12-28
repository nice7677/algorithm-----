package programmers.practice;

import java.util.Stack;

/**
 * @Programmers 12939
 * 연습문제
 * 최댓값과 최솟값
 */
public class PG12939 {

    public String solution(String s) {
        int min = 0, max = 0;
        String answer = "";
        String[] sSplit = s.split(" ");
        int i = 0;
        for (String s1 : sSplit) {
            int a = Integer.parseInt(s1);
            if (i == 0) {
                min = a;
                max = a;
                i++;
            } else {
                if (a < min) min = a;
                if (a > max) max = a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(min);
        stringBuilder.append(" ");
        stringBuilder.append(max);
        answer = stringBuilder.toString();
        return answer;
    }

}
