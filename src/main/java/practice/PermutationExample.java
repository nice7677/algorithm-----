package practice;

/**
 * 순열 Permutation (Java) https://bcp0109.tistory.com/14
 * 순열 예제 스왑
 * 순열이란 n 개의 값 중에서 r 개의 숫자를 모든 순서대로 뽑는 경우를 말합니다.
 * 예를 들어 [1, 2, 3] 이라는 3 개의 배열에서 2 개의 숫자를 뽑는 경우는
 * [1, 2]
 * [1, 3]
 * [2, 1]
 * [2, 3]
 * [3, 1]
 * [3, 2]
 * 이렇게 6 개가 됩니다.
 */
public class PermutationExample {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        permutation(arr, 0, n, 3);
    }

    /**
     * 첫번째는 swap 함수를 만들어서 배열들의 값을 직접 바꾸는 방법입니다.
     * 배열의 첫 값부터 순서대로 하나씩 바꾸며 모든 값을 한번씩 swap 합니다.
     * depth 를 기준 인덱스로 하여 depth 보다 인덱스가 작은 값들은 그대로 고정하고
     * depth 보다 인덱스가 큰 값들만 가지고 다시 swap 을 진행합니다.
     * @param arr
     * @param depth
     * @param n
     * @param r
     */
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

}
