package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 버블 소트 프로그램1
 */
public class BJ1377 {

    public static void main(String[] args) throws IOException {

        selection();

    }

    private static void selection() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] values = br.readLine().toCharArray();

        for (int i = 0; i < values.length; i++) {

            int largestPosition = i;
            int largest = values[i] - '0';

            for (int j = i + 1; j < values.length; j++) {
                if (values[j] - '0' > largest) {
                    largestPosition = j;
                    largest = values[j] - '0';
                }
            }

            if (largest > values[i] - '0') {

                char swap = values[largestPosition];
                values[largestPosition] = values[i];
                values[i] = swap;

            }

        }

        System.out.println(values);

    }

}
