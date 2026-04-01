""" 
LC 450: Delete Node in a BST
"""
class Solution:
    def delete_node(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if not root:
            return root
        
        if key > root.val:
            root.right = self.deleteNode(root.right, key)
        elif key < root.val:
            root.left = self.deleteNode(root.left, key)
        else:
            if not root.left:
                return root.right
            if not root.right:
                return root.left
            
            curr = root.right
            while curr.left:
                curr = curr.left
            
            root.val = curr.val
            root.right = self.deleteNode(root.right, root.val)
        
        return root