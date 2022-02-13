package practice;

/**
 * https://bcp0109.tistory.com/15
 * 조합이란 n 개의 숫자 중에서 r 개의 수를 순서 없이 뽑는 경우를 말합니다.
 * 예를 들어 [1, 2, 3] 이란 숫자 배열에서 2개의 수를 순서 없이 뽑으면
 * [1, 2]
 * [1, 3]
 * [2, 3]
 * 이렇게 3 개가 나옵니다.
 * 순열을 뽑았을 때 나오는 [2, 1] [3, 1] [3, 2] 등은 중복이라서 제거됩니다.
 * 부분 집합처럼 이해하시면 됩니다.
 * 여러 가지 방법이 있지만 핵심은 하나입니다.
 * 배열을 처음부터 마지막까지 돌며
 * 현재 인덱스를 선택하는 경우
 * 현재 인덱스를 선택하지 않는 경우
 * 이렇게 두가지로 모든 경우를 완전탐색 해주시면 됩니다.
 * ---------------------------------------
 * 변수	설명
 * arr	조합을 뽑아낼 배열
 * output	조합에 뽑혔는지 체크하는 배열
 * n	배열의 길이
 * r	조합의 길이
 * ---------------------------------------
 * 순열과 달리 조합은 r 을 유지할 필요가 없으므로 숫자를 하나 뽑을때마다 r 을 하나씩 줄여줍니다.
 * r == 0 일 때가 r 개의 숫자를 뽑은 경우입니다.
 */
public class CombinationExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i <= n; i++) {
            combination(arr, visited, 0, n, i);
        }
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
