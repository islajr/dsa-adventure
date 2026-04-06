import java.util.ArrayList;
import java.util.List;

// LC 199: Binary Tree Right Side View
class RightSideView {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }


        TreeNode(int val) {
            this.val = val;
        }

        
    }

    List<Integer> result = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    public void dfs(TreeNode node, int depth) {
        if (node == null)
            return;

        if (depth == result.size())
            result.add(node.val);

        dfs(node.right, depth + 1);
        dfs(node.left, depth + 1);
    }

}