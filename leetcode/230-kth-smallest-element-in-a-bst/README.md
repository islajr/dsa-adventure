# LC 230: Kth Smallest Element in a BST

> **Description:** [LC 230](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/)
>
> **Difficulty:** Medium


## Approach

### Inorder Traversal

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

In order to find the kth smallest element in a Binary Search Tree, this approach uses Inorder traversal.

Due to the specific characteristic of this type of binary trees where the left root contains values smaller than the node's value, and the right side contains greater values, inorder traversal of the tree produces values in the actual order.

This means that we simply need to traverse the tree recursively from the left first, append the current node's value, and run another recursive run on the right side.

When it all comes together, it is actually in order. At that point, it is simply a matter of selecting the corresponding k number we are interested in.

