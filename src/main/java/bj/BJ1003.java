package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
