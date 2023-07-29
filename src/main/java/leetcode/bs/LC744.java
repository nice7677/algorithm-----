package leetcode.bs;

/**
 * LEETCODE 744. Find Smallest Letter Greater Than Target
 */
public class LC744 {

    public static void main(String[] args) {

        LC744 lc744 = new LC744();
        char result = lc744.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a');
        System.out.println(result == 'c');
        char result2 = lc744.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');
        System.out.println(result2 == 'f');
        char result3 = lc744.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z');
        System.out.println(result3 == 'x');
        char result4 = lc744.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd');
        System.out.println(result4 == 'f');
        char result5 = lc744.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j');
        System.out.println(result5 == 'c');
    }

    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            }

            if (letters[mid] > target) {
                right = mid;
            }
        }

        return letters[left % letters.length];

    }

}
