package youtube.greedy;

public class Greedy2 {

    public static void main(String[] args) {
        System.out.println(solution("02984"));
    }

    static int solution(String v) {
        int result = v.charAt(0) - '0';
        for (int i = 1; i < v.length(); i++) {
            int num = v.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        return result;
    }

}
