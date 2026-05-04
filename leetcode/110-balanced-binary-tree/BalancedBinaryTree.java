// LC 110: Balanced Binary Trees

class Solution {
	public boolean isBalanced(TreeNode root) {
		return dfs(root)[0] == 1;	// [isBalanced, height]
	}

	private int[] dfs(TreeNode root) {
		if (root == null) return new int[]{1, 0};	// is balanced if null

		int[] left = dfs(root.left);
		int[] right = dfs(root.right);

		boolean balanced = (left[0] == 1 && right[0] == 1) &&
			(Math.max(left[1], right[1]) - Math.min(left[1], right[1]) <= 1);

		int height = 1 + Math.max(left[1], right[1]);

		return new int[]{balanced ? 1 : 0, height};
	}
}
