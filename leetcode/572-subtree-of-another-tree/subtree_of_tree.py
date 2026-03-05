""" 
LC 572: Subtree of Another Tree
"""
class Solution:
    def is_subtree(self, root: Optional[TreeNode], sub_root: Optional[TreeNode]) -> bool:
        if not sub_root:
            return True
        if not root:
            return False

        if self.same_tree(root, sub_root):
            return True
        return (self.is_subtree(root.left, sub_root) or self.is_subtree(root.right, sub_root))
    
    def same_tree(self, root: Optional[TreeNode], sub_root: Optional[TreeNode]) -> bool:
        if not root and not sub_root:
            return True
        if root and sub_root and root.val == sub_root.val:
            return (self.same_tree(root.left, sub_root.left) and self.same_tree(root.right, sub_root.right))
        return False
