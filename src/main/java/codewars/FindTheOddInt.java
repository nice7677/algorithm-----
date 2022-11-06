package codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * 배열에서 홀수개인 정수를 찾기
 * Time: 4498ms Passed: 1Failed: 0
 * XOR 연산자가 더좋다.
 */
public class FindTheOddInt {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }


    public static int findIt(int[] a) {
        Map<Integer, Integer> itMap = new HashMap<>();
        for (int i : a) {
            itMap.put(i, itMap.getOrDefault(i, 0) + 1);
        }
        for (Integer key : itMap.keySet()) {
            if (itMap.get(key) % 2 == 1) {
                System.out.println(itMap.get(key));
                return key;
            }
        }
        return 0;
    }

}
