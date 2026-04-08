// LC 1448: Count Good Nodes in Binary Tree

class GoodNodes {

	int dfs(TreeNode node, int maxVal) {
		if (node == null)
			return 0;

		int res = 0;

		res = node.val >= maxVal ? 1 : 0;
		maxVal = Math.max(node.val, maxVal);

		res = res + dfs(node.left, maxVal);
		res = res + dfs(node.right, maxVal);

		return res;
	}

	public int goodNodes(TreeNode root) {
		return dfs(root, root.val);
	}

}
