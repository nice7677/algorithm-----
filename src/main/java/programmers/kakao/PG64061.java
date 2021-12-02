package programmers.kakao;

import java.util.Stack;

/**
 * Programmers 64061
 * 2019 카카오 개발자 겨울 인턴십
 * 크레인 인형뽑기 게임
 */
public class PG64061 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] == 0) {
                    continue;
                } else {
                    if (basket.size() != 0) {
                        if (basket.peek() == board[i][move - 1]) {
                            basket.pop();
                            answer++;
                        } else {
                            basket.push(board[i][move - 1]);
                        }
                    } else if (basket.size() == 0){
                        basket.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer * 2;
    }

}
