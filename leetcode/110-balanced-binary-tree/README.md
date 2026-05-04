# LC 110: Balanced Binary Tree

> **Description:** [LC 110](https://leetcode.com/problems/balanced-binary-tree/description/)
>
> **Difficulty:** Easy
>


## Approach

A balanced binary tree is one where the left and right sub-trees of every node differ in height by no more than 1.

### Brute-force 

> **Time Complexity:** O(n^2)
>
> **Space Complexity:** O(log n) -- Best Case | O(n) -- Worst Case (Degenerate Tree)

This approach is really simple. Given the definition of a balanced tree, we recursively check and compare the heights of the left and right subtrees if <= 1.

That is two recursive stacks that gives this approach a quadratic time complexity. Too slow.

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(log n) -- Best Case | O(n) -- Worst Case (Degenerate Tree)

This approach uses DFS to return `balanced` and `height` of a binary tree at once for every node.

For each node, these results are gotten recursively from left and right children.

This approach improves on the brute-force approach by only having one recursive pass for left and right sub-trees (two actually).

Computing `height` and `balanced` becomes a problem of operations and arithmetic as opposed to more recursive calls.

One Recursive pass, same result.

