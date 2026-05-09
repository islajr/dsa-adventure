# LC 199: Binary Tree Right Side View

> **Description:** [LC 199](https://leetcode.com/problems/binary-tree-right-side-view/description/)
>
> **Difficulty:** Medium


## Approach

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

This problem requires the solver to return the nodes within a binary tree that are only visible from the right-side of the tree.

In other words, this means that the solver needs only return the first node on every depth level as seen from the right side of the tree.

To accomplish this using Recursive DFS, for each depth level, the algorithm tracks the right-most node by recursively calling itself on each right-side sub-tree, with the left-side sub-tree being passed as a fail-safe mechanism.

Once the algorithm reaches the last node and returns a null node, the program is complete.

