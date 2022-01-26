package leetcode.array.easy;

/**
 * LC 941. Valid Mountain Array
 */
public class LC941 {

    public static void main(String[] args) {

        System.out.println(validMountainArray(new int[]{3,5,5}));

    }

    public static boolean validMountainArray(int[] arr) {
        boolean turnChanger = false;
        if (arr.length < 3) return false;
        if (arr[0] > arr[1]) return false;
        int last = -1;
        for (int i : arr) {
            if (last > i) turnChanger = true;
            if (i == last) return false;
            if (turnChanger) if (i > last) return false;
            last = i;
        }
        return turnChanger;
    }

}