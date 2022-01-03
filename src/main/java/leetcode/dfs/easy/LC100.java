package leetcode.dfs.easy;

import leetcode.dfs.TreeNode;

/**
 * @LeetCode
 * Same Tree
 */
public class LC100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null && q != null || p != null && q == null || p.val != q.val) return false;
        else {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        }
    }

}
