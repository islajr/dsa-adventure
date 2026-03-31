# LC 701: Insert into a binary search tree
class Solution:
    def bst_insertion(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return TreeNode(val)
        
        if val < root.val:
            root.left = self.bst_insertion(root.left, val)
        else:
            root.right = self.bst_insertion(root.right, val)
        
        return root
