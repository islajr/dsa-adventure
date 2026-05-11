# LC 98: Validate Binary Tree

> **Description:** [LC 98](https://leetcode.com/problems/validate-binary-search-tree/description/)
>
> **Difficulty:** Medium


## Approach

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

A valid binary tree is one in which all left subnodes of a root node are less than its value, and all right subnodes are greater. 

While this is true, it does not tell the full story. The root node of a binary search tree has no ancestors and hence, has value bounds of negative and positive infinity.

This serves as a good starting point, and is reflected in the recursive case. When passing the left sub-tree, the root node's value becomes the upper bound, and when passing the right sub-tree, the root's node becomes the lower bound. 

Gradually, as the algorithm moves lower into the tree, the values progressively become smaller, and in any event that the condition of validation is not met, the code cuts off and returns the appropriate value.

