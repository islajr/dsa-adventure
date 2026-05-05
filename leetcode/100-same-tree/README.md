# LC 100: Same Tree

> **Description:** [LC 100](https://leetcode.com/problems/same-tree/description/)
>
> **Difficulty:** Easy


## Approach

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(log n) -- Best Case | O(n) -- Worst Case (Degenerate Tree)

Two trees are the same if they have the same node structure and values at each node. With this knowledge, it is trivial to check if two trees are the same.

Any two nodes are the same if they both have the same value (even null values) or if they are both null. Any other situation suggests that they are, in fact, not the same.

Any contratry situation returns false, and in situations of equal non-null values, the check continues recursively.

An important clarification to make is that the `isSameTree()` method tests between the same treeNode in two different trees. 
Say we're comparing two trees: x and y, the two values passed into the checker method at any given time would be `x.left` and `y.left` or `x.right` and `y.right` at every node level.
