// LC 572: Subtree of Another Tree

class Solution {
	public boolean isSubtree(TreeNode root, TreeNode subroot) {
		// base case 1
		if (subroot == null) return true;
		// base case 2
		if (root == null) return false;

		if (isSame(root, subRoot) return true;
		
		return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
	}

	private boolean isSame(TreeNode root, TreeNode subroot) {
		if (root == null && subroot == null) return true;
		
		if (root != null && subroot != null && root.val == subroot.val) {
			return isSame(root.left, subroot.left) && isSame(root.right, subroot.right);
		}

		return false;
	}
}
