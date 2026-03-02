# LC 543: Diameter of Binary Tree

> **Description:** [LC 543](https://leetcode.com/problems/diameter-of-binary-tree/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(log n) -- Best Case | O(n) -- Worst Case (Degenerate Tree)

## Approach

The diamater of a binary tree is the longest path between any two nodes. Nodes contain two children at each point, and as such, the length is `left subtree height + right subtree height`

While computing heights with DFS, it is possible to simultaneously track the maximum `left + right` seen so far to produce the diameter in one pass.
