package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 백준 1152 단어의 개수
 */
public class BJ1152 {

    /**
     * 메모리 28328
     * 시간 312
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> wordsList = Arrays.stream(br.readLine().split(" ")).filter(s -> !s.equals("")).collect(Collectors.toList());
        System.out.println(wordsList.size());

    }

}
