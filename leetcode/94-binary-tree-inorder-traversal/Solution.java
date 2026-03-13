import java.util.ArrayList;
import java.util.List;

public class Solution {
    /* Definition for a binary tree node */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        inorder(root, result);
        return result;
    }

    void inorder(TreeNode node, ArrayList<Integer> result) {
        if (node == null)
            return;
        
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
