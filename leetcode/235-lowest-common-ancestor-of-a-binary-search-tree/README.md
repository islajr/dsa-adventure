# LC 235: Lowest Common Ancestor of a Binary Search Tree

> **Description:** [LC 235](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/)
>
> **Difficulty:** Medium


## Approach

### Recursion

> **Time Complexity:** O(h)
>
> **Space Complexity:** O(h)
> 
> Where h is the height of the tree

Given the root of a Binary Search Tree (BST) with unique values, and two random nodes from within the tree, the lowest common ancestor would be the closest node that forms a common ancestor for both provided nodes.

Due to the fact that the root tree is a BST where values on the left are smaller than the parent node, and values on the right are greater than the parent node, it becomes intuituve to solve this problem.

At any point in the root tree, if the value at that point is null, or the values of any provided roots are null, we return `null`.

Similarly, if the value at a node is greater than anything provided, both values can only lie in the right sub-tree. The same goes for if the values are smaller, as they would only be found in the left sub-tree.

Any other result would suggest that the current node is, in fact, the lowest common ancestor. 

In order to look through the left and right sub-trees, we recursively call the main method and pass in the left and right sub-trees as the root value.

Time and space complexity of this approach is only as high as the height of the tree in the worst case.

