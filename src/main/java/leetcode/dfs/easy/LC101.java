package leetcode.dfs.easy;

import leetcode.dfs.TreeNode;

/**
 * LeetCode
 * Symmetric Tree
 * 좌우의 같은 노드 확인하기
 */
public class LC101 {

    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }

    public boolean dfs(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        return (node1.val == node2.val) && dfs(node1.left, node2.right) && dfs(node1.right, node2.left);
    }

}
