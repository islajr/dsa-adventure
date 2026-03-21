# LC 144: Binary Tree Preorder Traversal

> **Description:** [LC 144](https://leetcode.com/problems/binary-tree-preorder-traversal/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n) - Recursion stack | O(n) - Output array

## Approach

### Recursive Approach

This approach used **Depth-first search** to traverse the Tree in a preorder manner.

This is to say that it appends the value on the current node (`node.val`) first before it moves from left to right, recursively evaluating `node.left -> node.right`, and appending the stored `node.val` into a list that is eventually returned once the function exits.  

### Iterative Approach

This approach is much clearer and gives deeper insight compared to the recursive approach above. It forces the user to manually implement the call stack used implicitly in the recursive solution.

A stack is used to store the right values of each node, null inclusive, and as long as the stack is either not empty or the current value is not `None`, the program continues.

The moment the stack is empty and `curr` variable holds `None` simultaneously, the program draws to an end and the resultant array is returned.
