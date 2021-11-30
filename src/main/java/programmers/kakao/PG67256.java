package programmers.kakao;

/**
 * Programmers 67256
 * [카카오 인턴] 키패드 누르기
 */
public class PG67256 {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        String[][] keyPad = {
                {"1", "4", "7", "99"},
                {"2", "5", "8", "0"},
                {"3", "6", "9", "98"},
        };
        int[] rightLastLocation = {0, 3};
        int[] leftLastLocation = {2, 3};
        if (hand.equals("left")) {
            hand = "L";
        } else {
            hand = "R";
        }
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                for (int i = 0; i < keyPad[0].length; i++) {
                    if (Integer.parseInt(keyPad[0][i]) == number) {
                        leftLastLocation = new int[]{0, i};
                        answer += "L";
                    }
                }
            } else if (number == 3 || number == 6 || number == 9) {
                for (int i = 0; i < keyPad[2].length; i++) {
                    if (Integer.parseInt(keyPad[2][i]) == number) {
                        rightLastLocation = new int[]{2, i};
                        answer += "R";
                    }
                }
            } else {
                int leftMoveCount = 0;
                int rightMoveCount = 0;
                for (int i = 0; i < keyPad[1].length; i++) {
                    if (Integer.parseInt(keyPad[1][i]) == number) {
                        int[] location = {1, i};
                        leftMoveCount = getMoveCount(leftLastLocation, location);
                        rightMoveCount = getMoveCount(rightLastLocation, location);
                        if (rightMoveCount > leftMoveCount) {
                            answer += "L";
                            leftLastLocation = new int[]{1, i};
                        } else if (leftMoveCount > rightMoveCount) {
                            answer += "R";
                            rightLastLocation = new int[]{1, i};
                        } else if (leftMoveCount == rightMoveCount) {
                            answer += hand;
                            if (hand.equals("L")) {
                                leftLastLocation = new int[]{1, i};
                            } else {
                                rightLastLocation = new int[]{1, i};
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }

    public int getMoveCount(int[] leftRightLocation, int[] location) {
        return ((leftRightLocation[0] - location[0]) > 0
                ? leftRightLocation[0] - location[0]
                : (leftRightLocation[0] - location[0]) * -1)
                + ((leftRightLocation[1] - location[1]) > 0
                ? leftRightLocation[1] - location[1]
                : (leftRightLocation[1] - location[1]) * -1);
    }

}
