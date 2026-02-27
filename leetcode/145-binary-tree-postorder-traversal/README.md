# LC 145: Binary Tree Postorder Traversal

> **Description:** [LC 145](https://leetcode.com/problems/binary-tree-postorder-traversal/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n) - Recursion stack | O(n) - Output array

## Approach

This approach used **Depth-first search** to traverse the Tree in a postorder manner.

This means that the program visits the children of a node, `node.left` and `node.right` before visiting the node itself and appending it's value `node.val` to the resultant list
