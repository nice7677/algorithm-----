package leetcode;

/**
 * 1323. Maximum 69 Number
 * 6이랑9로만된거에서 하나만바꿔서 제일큰거만들기
 */
public class LC1323 {

    public static void main(String[] args) {
        System.out.println(maximum69Number(69696));
    }

    /**
     * Runtime
     * 1 ms
     * Beats
     * 88.30%
     * Memory
     * 41.8 MB
     * Beats
     * 8.93%
     * 메모리 구림;
     * @param num
     * @return
     */
    public static int maximum69Number (int num) {
        char[] numList = String.valueOf(num).toCharArray();
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] - '0' == 6) {
                numList[i] = 9 + '0';
                return Integer.parseInt(String.valueOf(numList));
            }
        }
        return Integer.parseInt(String.valueOf(numList));
    }

}
