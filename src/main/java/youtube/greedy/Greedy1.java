package youtube.greedy;

public class Greedy1 {

    public static void main(String[] args) {
        System.out.println(solution(25, 3));;
    }

    static int solution(int n, int k) {
        int count = 0;
        while (n != 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
    }

}
