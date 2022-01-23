package leetcode.sorting.easy;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 1859. Sorting the Sentence
 */
public class LC1859 {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    /**
     * Runtime: 9 ms, faster than 8.84% of Java online submissions for Sorting the Sentence.
     * Memory Usage: 39 MB, less than 24.75% of Java online submissions for Sorting the Sentence.
     * 왕구리다;
     * @param s
     * @return
     */
    public static String sortSentence(String s) {
        String[] splitSentence = s.split(" ");
        Queue<String> sentenceQueue = new LinkedBlockingQueue<>();
        for (String item : splitSentence) {
            sentenceQueue.offer(item);
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (!sentenceQueue.isEmpty()) {
            String item = sentenceQueue.poll();
            if (item.charAt(item.length() - 1) - '0' == count) {
                sb.append(item.split(String.valueOf(count))[0]);
                if (count != splitSentence.length) sb.append(" ");
                count++;
            } else {
                sentenceQueue.offer(item);
            }
        }
        return sb.toString();
    }

}
