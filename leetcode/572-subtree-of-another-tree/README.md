# LC 100: Subtree of Another Tree

> **Description:** [LC 572](https://leetcode.com/problems/subtree-of-another-tree/description/)
>
> **Difficulty:** Easy


## Approach

### Recursive DFS

> **Time Complexity:** O(m * n)
>
> **Space Complexity:** O(m + n)
>
> Where `m` is the number of nodes in `root` and `n` is the number of nodes in `subRoot`.
>

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

Knowing this, **recursion** is the best best to solve this. In order to do so, some guidelines need to be established:

- A subroot is valid if it is null

- A root is invalid if it is null

This approach uses two loops: one for comparing subtrees on a general level, and the other for comparing specific parts of a subtree.

In the main loop, the two main checks outlined above are made, and the second loop is called to confirm if both tree nodes are the same on that level. 

The recursive case of the main loop then rolls the check, comparing the subtree to both the left and right subtrees of the root node.

In the second loop, the check is much more granular: is the root values of both trees are non-null and possess equal values, a recursive call is made to confirm that the left and right values indeed match.

The recursive calls here take care of all subchildren and return a value to the main loop.


