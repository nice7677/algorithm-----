package programmers.skilltest;

public class PG406256 {

    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int n) {
        StringBuilder builder = new StringBuilder();
        String waterMelon = "수박";
        int a = n / waterMelon.length();
        int b = n % waterMelon.length();
        for(int i = 0; i < a; i++) {
            builder.append(waterMelon);
        }
        if (b == 1) {
            return builder.append("수").toString();
        }
        return builder.toString();
    }

}
