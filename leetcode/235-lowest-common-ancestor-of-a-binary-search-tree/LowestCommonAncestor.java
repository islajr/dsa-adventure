/* 
 *  LC 235: Lowest Common Ancestor of a Binary Search Tree
* */

public class LowestCommonAncestor {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null)
            return null;
        
        if (Math.max(p.val, q.val) < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (Math.min(p.val, q.val) > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }
}