package programmers.kakao;

/**
 * Programmers 17682
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 다트 게임
 */
public class PG17682 {

    public int solution(String dartResult) {
        int answer = 0;
        String[] dartResultSplit = dartResult.split("");
        double[] resultArr = new double[3];
        int resultArrCount = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResultSplit[i].matches("[0-9]")) {
                resultArr[resultArrCount] = Double.parseDouble(dartResultSplit[i]);
                if (dartResultSplit[i + 1].matches("[0]")) {
                    resultArr[resultArrCount] *= 10;
                    i++;
                }
                resultArrCount++;
            } else if ("D".equals(dartResultSplit[i])) {
                resultArr[resultArrCount - 1] = Math.pow(resultArr[resultArrCount - 1], 2);
            } else if ("T".equals(dartResultSplit[i])) {
                resultArr[resultArrCount - 1] = Math.pow(resultArr[resultArrCount - 1], 3);
            } else if ("*".equals(dartResultSplit[i])) {
                for (int j = (resultArrCount - 2 >= 0) ? resultArrCount - 2 : 0; j < resultArrCount; j++) {
                    resultArr[j] *= 2;
                }
            } else if ("#".equals(dartResultSplit[i])) {
                resultArr[resultArrCount - 1] *= -1;
            }
        }
        for (double v : resultArr) {
            answer += v;
        }
        return answer;
    }

}
