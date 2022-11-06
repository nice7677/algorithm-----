package codewars;

import java.util.List;

/**
 * 문장에서 모음 제거하기
 * 정규표현식이 더 좋다.
 */
public class DisemvowelTrolls {

    public static List<String> vowelList = List.of("A", "E", "I", "O", "U");

    public static void main(String[] args) {

        System.out.println(disemvowel("This website is for losers LOL!"));

    }

    public static String disemvowel(String str) {
        // Code away...
        String[] strArray = str.split(""); // or char[]
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            if (!isVowel(s)) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(String word) {
        return vowelList.stream()
                .anyMatch(s -> s.equals(word) || s.toLowerCase().equals(word));
    }

}
