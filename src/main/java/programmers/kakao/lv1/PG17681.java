package programmers.kakao.lv1;

/**
 * Programmers 17681
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 비밀지도
 */
public class PG17681 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] arr1TDA = makeArr(arr1, n);
        int[][] arr2TDA = makeArr(arr2, n);
        for (int i = 0; i < n; i++) {
            answer[i] = "";
            for (int j = 0; j < n; j++) {
                if (arr1TDA[i][j] == 1 || arr2TDA[i][j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }

    public int[][] makeArr(int[] arr, int n) {
        int[][] returnArr = new int[arr.length][arr.length];

        int i = 0;
        for (int a : arr) {
            StringBuilder stringBuilder = new StringBuilder();
            int gap = n - Integer.toBinaryString(a).length();
            if (gap != 0) {
                for (int j = 0; j < gap; j++) {
                    stringBuilder.append("0");
                }
            }
            stringBuilder.append(Integer.toBinaryString(a));
            String[] arrStringSplit = stringBuilder.toString().split("");
            for (int j = 0; j < arrStringSplit.length; j++) {
                returnArr[i][j] = Integer.valueOf(arrStringSplit[j]);
            }
            i++;
        }
        return returnArr;
    }

}
