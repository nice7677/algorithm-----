package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 12. Integer to Roman
 */
public class LC12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }

    static Map<Integer, String> romanMap = new HashMap();

    static {
        romanMap.put(1, "I");
        romanMap.put(5, "V");
        romanMap.put(10, "X");
        romanMap.put(50, "L");
        romanMap.put(100, "C");
        romanMap.put(500, "D");
        romanMap.put(1000, "M");
        romanMap.put(4, "IV");
        romanMap.put(9, "IX");
        romanMap.put(40, "XL");
        romanMap.put(90, "XC");
        romanMap.put(400, "CD");
        romanMap.put(900, "CM");
    }

    /**
     * 재귀
     *
     * @param num
     * @return
     */
    public static String intToRoman(int num) {
        if (romanMap.containsKey(num)) return romanMap.get(num);
        int value = romanMap.keySet().stream()
                .filter(v -> v < num)
                .max(Comparator.naturalOrder())
                .get();
        // 명시된 키값 돌면서 작은것중 제일 큰거를 뽑음
        // 재귀 돌면서 하나씩 추려냄
        // num - value !
        return romanMap.get(value) + intToRoman(num - value);
    }

}
