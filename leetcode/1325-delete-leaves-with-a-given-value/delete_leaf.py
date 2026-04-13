# LC 1325: Delete Leaves with a Given Value

class RemoveLeadNodes:
    def remove_leaf_nodes:
        if not root:
            return None
        
        root.left = self.removeLeafNodes(root.left, target)
        root.right = self.removeLeafNodes(root.right, target)

        if not root.left and not root.right and root.val == target:
            return None
        
        return root
