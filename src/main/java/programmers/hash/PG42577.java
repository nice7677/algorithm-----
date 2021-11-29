package programmers.hash;

import java.util.Arrays;

/**
 * [프로그래머스 42577] 전화번호 목록
 */
public class PG42577 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
            }
        }
        return answer;
    }

}
