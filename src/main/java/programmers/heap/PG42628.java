package programmers.heap;

import java.util.*;

/**
 * @Programmers 42628
 * 힙(Heap)
 * 이중우선순위큐
 */
public class PG42628 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"I 7","I 5","I -5","D -1"}));
    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for (String operation : operations) {
            if (operation.split("I ").length == 2) {
                list.add(Integer.valueOf(operation.split("I ")[1]));
            } else if (operation.equals("D 1")) {
                if (list.size() != 0) {
                    list.remove(Collections.max(list));
                }
            } else if (operation.equals("D -1")) {
                if (list.size() != 0) {
                    list.remove(Collections.min(list));
                }
            }
        }
        if (list.size() == 0) return new int[]{0, 0};
        answer[0] = Collections.max(list);
        answer[1] = Collections.min(list);
        return answer;
    }

}
