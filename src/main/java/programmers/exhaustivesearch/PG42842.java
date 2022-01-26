package programmers.exhaustivesearch;

/**
 * @Programmers 42842
 * 완전탐색
 * 카펫
 */
public class PG42842 {

    public static void main(String[] args) {
        System.out.println(solution(24, 24));
    }

    /**
     * Brown / 2로 나눈거에 yellow의 약수중 brown / 2 보다 앞이 작은 애들중 뒤에있는 뒷자리를 Brown/ 2에 마이너스하고 뒤에는 플러스하고 값이 더한값이랑 같으면 풀림
     * @param brown
     * @param yellow
     * @return
     */
    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] result = new int[]{brown / 2, 2};
        for (int i = 1; i <= yellow; i++) {
            if ((yellow % i) == 0 && result[0] > yellow / i && (result[0] - i) * (result[1] + i) == sum) {
                result[0] = result[0] - i;
                result[1] = result[1] + i;
                break;
            }
        }
        return result;
    }

}
