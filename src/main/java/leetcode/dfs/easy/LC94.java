package leetcode.dfs.easy;

import leetcode.dfs.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @LeetCode Binary Tree Inorder Traversal
 */
public class LC94 {

    /**
     * inorder traversal 중위 순회로 풀수있음.
     * https://gnujoow.github.io/ds/2016/09/01/DS4-TreeTraversal/
     *
     * @param root
     * @return
     */
    List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        if (node.left != null) dfs(node.left, result);
        result.add(node.val);
        if (node.right != null) dfs(node.right, result);
    }

}