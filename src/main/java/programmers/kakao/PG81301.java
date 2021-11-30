package programmers.kakao;

/**
 * Programmers 81301
 * 2021 카카오 채용연계형 인턴십
 * 숫자 문자열과 영단어
 */
public class PG81301 {

    public int solution(String s) {
        String[][] numberEnglish = {{"zero", "0"}, {"one", "1"}, {"two", "2"}, {"three", "3"}, {"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"}, {"eight", "8"}, {"nine", "9"}};
        for (int i = 0; i < numberEnglish.length; i++) {
            s = s.replaceAll(numberEnglish[i][0], numberEnglish[i][1]);
        }
        return Integer.parseInt(s);
    }

}
