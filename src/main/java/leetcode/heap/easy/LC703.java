package leetcode.heap.easy;


import java.util.PriorityQueue;

/**
 * @LeetCode
 * Kth Largest Element in a Stream
 *
 * Design a class to find the kth largest element in a stream.
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 */
public class LC703 {

    public static void main(String[] args) {
        LC703 lc703 = new LC703(1, new int[]{});
        lc703.add(1);
        lc703.add(2);
        lc703.add(3);
        lc703.add(4);
        lc703.add(5);
    }

    PriorityQueue<Integer> pq;
    int k;

    public LC703(int k, int[] nums) {
        this.k = k;
        // 값을줘버리고 값만채움, 메모리와 실행시간에 영향
        pq = new PriorityQueue<>(k);
        for (int item : nums) {
            pq.offer(item);
            // 초기값보다 크면 삭제
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.offer(val);
        // 초기값보다 크면 삭제
        if (pq.size() > k) {
            pq.poll();
        }
        // 그럼 이게 나옴
        return pq.peek();
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */