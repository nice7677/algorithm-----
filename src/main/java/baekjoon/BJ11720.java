package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 11720 숫자의합
 */
public class BJ11720 {

    /**
     * 메모리 14248kb
     * 시간 124ms
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String numListString = br.readLine();
        char[] numList = numListString.toCharArray();
        int sum = 0;
        for (char num : numList) {
            sum += num - '0';
        }
        System.out.println(sum);

    }

}
