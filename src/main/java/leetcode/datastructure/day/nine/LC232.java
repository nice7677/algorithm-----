package leetcode.datastructure.day.nine;

import java.util.Stack;

/**
 * LeetCode 232. Implement Queue using Stacks
 */
public class LC232 {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.push(4);
        mq.pop();
        mq.push(5);
        mq.pop();
        mq.pop();
        mq.pop();
        mq.pop();
    }

}


/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
 * Memory Usage: 40.1 MB, less than 15.17% of Java online submissions for Implement Queue using Stacks.
 */
class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        //pop, peak 할때 s1 -> s2로 옴긴거 다시 s2 -> s1 옴김
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    public int pop() {
        //push할때 s1 -> s2 옴김
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        //push할때 s1 -> s2 옴김
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
