package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 백준 2750
 */
public class BJ2750 {

    /**
     * 192ms
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        bubble();

    }

    private static void bubble() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] number = new int[count];
        for (int i = 0; i < count; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }
        while (true) {
            int swapCount = 0;
            for (int i = 0; i < number.length; i++) {
                swapCount = swap(swapCount, number, i, i + 1);
            }
            if (swapCount == 0) {
                break;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    private static int swap(int count, int[] values, int x, int y) {

        if (x == values.length - 1) {
            return count;
        }

        if (values[x] > values[y]) {
            int value = values[x];
            values[x] = values[y];
            values[y] = value;
            return count + 1;
        }

        return count;

    }

}
