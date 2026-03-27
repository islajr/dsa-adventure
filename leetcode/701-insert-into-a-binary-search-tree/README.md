# LC 701: Insert into a Binary Search Tree

> **Description:** [LC 701](https://leetcode.com/problems/insert-into-a-binary-search-tree/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(log n)
>
> **Space Complexity:** O(h) -- Recursion stack

## Approach

## Recursive Approach

The recursive approach to insert into a binary search works on the simple principle of creating a new `TreeNode` whenever the algorithms traverses to a `null` point.

In alignment with the principle behind binary trees, the algorithm checks, at every node, if the value to be inserted is greater than the value of the current node.

If greater, it narrows down towards the right subtree and goes the opposite way if lesser. This algorithm is repeated recursively until the base case is executed and the `value` is inserted appropriately.
