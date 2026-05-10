# LC 1448: Count Good Nodes in Binary Tree

> **Description:** [LC 1448](https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/)
>
> **Difficulty:** Medium


## Approach

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

Within a binary tree, a good node is a node that has no node with a greater value than it on its path from the root node.

Knowing this, we just need to traverse the tree, tracking the maximum value seen so far and comparing that value to the value at every node.


The rest of the tree is traversed recursively, left to right. Instances of nodes that are found to be 'good' are stored appropriately, and returned upon the end of the search.

