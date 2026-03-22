""" 
LC 94: Binary Tree Inorder Traversal

Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
"""
class Solution:
    
    # iterative solution
    def inorder_traversal_iter(self, root: Optional[TreeNode]) -> List[int]:
        curr, stack = root, []
        res = []

        while curr or stack:
            while curr:
                stack.append(curr)
                curr = curr.left
            curr = stack.pop()
            res.append(curr.val)
            curr = curr.right
        return res


    # recursive solution
    def inorder_traversal_recursive(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        
        def inorder(node):
            if not node:
                return
            
            inorder(node.left)
            res.append(node.val)
            inorder(node.right)
        
        inorder(root)
        return res
