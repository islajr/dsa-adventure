// LC 144: Preorder Traversal

class PreorderTraversal {

    private void preorder(TreeNode node, List<Integer> arr) {
            if(node == null)
                return;
            
            arr.add(node.val);
            preorder(node.left, arr);
            preorder(node.right, arr);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();

        preorder(root, res);
        return res;

    }
}
