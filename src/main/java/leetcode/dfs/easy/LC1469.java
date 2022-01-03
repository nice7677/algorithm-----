package leetcode.dfs.easy;

import leetcode.dfs.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @LeetCode 1469. Find All The Lonely Nodes
 * 자식 노드가 하나인 부모 노드 찾기 문제
 */
public class LC1469 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {
        dfs(root, false);
        return result;
    }

    public void dfs(TreeNode node, boolean isOnlyOneChild) {
        if (node == null) return;
        if (isOnlyOneChild) {
            result.add(node.val);
        }
        if (node.left == null && node.right != null)
            dfs(node.right, true);
        else if (node.left != null && node.right == null)
            dfs(node.left, true);
        else {
            dfs(node.left, false);
            dfs(node.right, false);
        }
    }
}
