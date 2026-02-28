# LC 104: Maximum Depth of Binary Tree

> **Description:** [LC 104](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** Worst Case -- O(n) | Best Case -- O(log(n))

## Approach

This approach uses the formula: `depth of a tree = 1 + max depth of left and right subtrees`. 

It is a recursive Depth-First Search approach that computes the depth of the binary tree by exploring every node.

This means that for each node, we recursively compute the depths of both left and right sub-trees, taking the maximum of both and adding 1 for the current node.
