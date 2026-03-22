# LC 94: Binary Tree Inorder Traversal

> **Description:** [LC 94](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n) - Recursion stack | O(n) - Output array

## Approach

### Recursive Approach

This approach used **Depth-first search** to traverse the Tree in order.

This is to say that it moves from left to right, recursively evaluating `node.left -> node.right`, while concurrently appending the stored values `node.val` into a list that is eventually returned once the function exits.  

### Iterative Approach

Inorder traversal, by definition, traverses the entire left side of a binary tree firstly, before storing the value of the context node, and then traversing the right sub-tree of said node.

This approach implements the dynamic by simulating and handling the `recursion stack` used in the **recursive approach** manually. The code firstly goes as far left as possible, adding the nodes to the stack as it goes and once all left nodes have been exhausted, it pops from the stack and evaluates the right sub-tree of the stored node in the same fashion. 
