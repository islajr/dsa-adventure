// LC 104: Maximum Depth of Binary Tree

class MaxDepth {
	public int maxDepth(TreeNode root) {
		int res = 0;

		if (root == null) return 0;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
