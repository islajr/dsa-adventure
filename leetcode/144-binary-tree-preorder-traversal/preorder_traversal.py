""" 
LC 144: Binary Tree Preorder Traversal

Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
class Solution:
    
    # recursive solution
    def preorder_traversal(self, root: Optional[TreeNode]) -> list[int]:
        res = []
        
        def preorder(node):
            if not node:
                return

            res.append[node.val]
            preorder(node.left)
            preorder(node.right)
        
        preorder(root)
        return res
    
    # iterative solution
    def preorder_traversal_iter(self, root: Optional[TreeNode]) -> List[int]:
        curr, stack = root, []
        res = []
        
        while curr or stack:
            if curr:
                res.append(curr.val)
                stack.append(curr.right)
                curr = curr.left
            else:
                curr = stack.pop()