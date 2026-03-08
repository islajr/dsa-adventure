""" 
LC 235: Lowest Common Ancestor of a Binary Search Tree
"""
class Solution:
    def lowest_common_ancestor(self, root: Optional[TreeNode], p: Optional[TreeNode], q: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root or not p or not q:
            return None
        if (max(p.val, q.val) < root.val):
            return self.lowest_common_ancestor(root.left, p, q)
        elif (min(p.val, q.val) > root.val):
            return self.lowest_common_ancestor(root.right, p, q)
        else:
            return root