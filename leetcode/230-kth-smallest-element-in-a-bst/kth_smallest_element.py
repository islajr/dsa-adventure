# LC 230: Kth Smallest Element in a BST

class KthElement:
    def kth_smallest_element(self, root: Optional[TreeNode], k: int) -> int:
        arr = []

        def dfs(node):
            if not node:
                return
            
            dfs(node.left)
            arr.append(node.val)
            dfs(node.right)
        
        dfs(root)
        return arr[k - 1]

