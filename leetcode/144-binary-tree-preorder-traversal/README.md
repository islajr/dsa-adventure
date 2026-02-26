# LC 144: Binary Tree Preorder Traversal

> **Description:** [LC 144](https://leetcode.com/problems/binary-tree-preorder-traversal/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n) - Recursion stack | O(n) - Output array

## Approach

This approach used **Depth-first search** to traverse the Tree in a preorder manner.

This is to say that it appends the value on the current node (`node.val`) first before it moves from left to right, recursively evaluating `node.left -> node.right`, and appending the stored `node.val` into a list that is eventually returned once the function exits.  
