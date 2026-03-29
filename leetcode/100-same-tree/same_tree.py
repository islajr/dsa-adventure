""" 
LC 100: Same Tree

"""
from typing import Optional

class TreeNode:
    def __init__(self, left, right, val):
        self.left = left
        self.right = right
        self.val = val
        
class Solution:
    def same_tree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if p and q and p.val == q.val:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        else:
            return False
