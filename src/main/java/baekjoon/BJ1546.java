package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1546 평균 구하기
 */
public class BJ1546 {

    /**
     * 메모리 14336kb
     * 시간 124ms
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float count = Integer.parseInt(br.readLine());
        String score = br.readLine();
        String[] scoreList = score.split(" ");
        float sum = 0;
        float M = 0;
        for (String s : scoreList) {
            float a = Integer.parseInt(s);
            if (a > M) {
                M = a;
            }
            sum += a;
        }
        System.out.println(sum / M * 100 / count);

    }

}
