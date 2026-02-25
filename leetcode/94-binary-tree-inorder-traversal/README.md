# LC 94: Binary Tree Inorder Traversal

> **Description:** [LC 94](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n) - Recursion stack | O(n) - Output array

## Approach

This approach used **Depth-first search** to traverse the Tree in order.

This is to say that it moves from left to right, recursively evaluating `node.left -> node.right`, while concurrently appending the stored values `node.val` into a list that is eventually returned once the function exits.  
