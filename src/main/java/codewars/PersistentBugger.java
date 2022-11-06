package codewars;

/**
 * Persistent Bugger
 * 한자리 수가 될때까지 곱한 횟수
 * Time: 2318ms Passed: 2Failed: 0
 * 재귀가 더 좋다..
 */
public class PersistentBugger {

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }

    public static int persistence(long n) {
        // your code
        int z = 0;
        while (true) {
            if (n < 10) break;
            char[] charArray = getCharArray(n);
            int x = 1;
            for (char c : charArray) {
                x *= c - '0';
            }
            n = x;
            z++;
        }
        return z;
    }

    public static char[] getCharArray(long n) {
        return String.valueOf(n).toCharArray();
    }

}
