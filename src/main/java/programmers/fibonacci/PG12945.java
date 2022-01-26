package programmers.fibonacci;

/**
 * @Programmers 12945
 * 연습문제
 * 피보나치 수
 */
public class PG12945 {

    int[] fiboArr = null;

    public int solution(int n) {
        fiboArr = new int[n + 1];
        int answer = fibonacci(n);
        return answer;
    }

    public int fibonacci(int x) {
        if (x == 1) return 1;
        if (fiboArr[x] != 0) return fiboArr[x];
        fiboArr[x] = (fibonacci(x - 1) + fibonacci(x - 2)) % 1234567;
        return fiboArr[x];
    }

}
