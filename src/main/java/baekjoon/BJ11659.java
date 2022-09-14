package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 구간합 구하기 11659
 */
public class BJ11659 {
    static int sum = 0;
    static int[] sumArray;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int N = Integer.parseInt(MN[0]);
        int M = Integer.parseInt(MN[1]);
        String[] X = br.readLine().split(" ");
        sumArray = new int[N];
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(X[i]);
            sumArray[i] = sum;
        }
        for (int i = 0; i < M; i++) {
            String[] Y = br.readLine().split(" ");
            System.out.println(sumArray[Integer.parseInt(Y[1]) - 1] - (Y[0].equals("1") ? 0 : sumArray[Integer.parseInt(Y[0]) - 2]));
        }
    }

}
