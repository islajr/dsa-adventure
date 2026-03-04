# LC 110: Balanced Binary Tree

> **Description:** [LC 110](https://leetcode.com/problems/balanced-binary-tree/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(log n) -- Best Case | O(n) -- Worst Case (Degenerate Tree)

## Approach

A balanced binary tree is one where the left and right sub-trees of every node differ in height by no more than 1

This approach uses DFS to return `isBalanced` and `height` of a binary tree at once for every node.

For each node, results are gotten recursively from left and right children, and a node is balanced if the left and right sub-trees are balanced, and the height difference <= 1

The height of the current node is computed as: `1 + max(leftHeight, rightHeight)`

`dfs()` is then run on the root to reveal `isBalanced()` value.
