package leetcode;


/**
 * LeetCode 876. Middle of the Linked List
 */
public class LC876 {

    public static void main(String[] args) {
        System.out.println(middleNode(new ListNode(5)));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 42.3 MB, less than 5.80% of Java online submissions for Middle of the Linked List.
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head) {
        ListNode[] list = new ListNode[100];
        int a = 0;
        while (head != null) {
            list[a++] = head;
            head = head.next;
        }
        return list[a / 2];
    }

}
