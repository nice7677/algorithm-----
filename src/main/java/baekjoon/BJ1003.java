package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1003
 * 피보나치 함수
 */
public class BJ1003 {

    static Integer[] result = new Integer[41];

    static Integer fibonacci(Integer n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (result[n] == null) {
                result[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
            return result[n];
        }
    }

    /**
     * 시간 초과 문제로 Scanner -> BufferReader로 바꾸니 해결댐.
     * Scanner 와 BufferReader의 차이 설명
     * https://carpediem0212.tistory.com/11
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer T = Integer.parseInt(br.readLine());
//        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            Integer n;
//            n = sc.nextInt();
            n = Integer.parseInt(br.readLine());
            if (n >= 0 && n <= 40) {
                fibonacci(n);
                if (n == 0) {
                    System.out.println("1 0");
                } else if (n == 1) {
                    System.out.println("0 1");
                } else {
                    System.out.println(result[n - 1] + " " + result[n]);
                }
            }
        }
    }

}
