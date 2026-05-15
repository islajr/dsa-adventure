# LC 102: Binary Tree Level Order Traversal

> **Description:** [LC 102](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)
>
> **Difficulty:** Medium


## Approach

### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

The **level** of a binary node is the distance from the root of the tree to that node. This problem requires us to travese a binary tree order-by-order.

This approach uses two nested lists of integers, with each list inside of the main list holding the nodes present at any registered level.

In order to solve efficiently, we use recursion and DFS. On each iteration, if the root node is a null value, the loop quits. 

If the node has been visited before, it would be present in the array for appending, otherwise, it is added promptly.

Rounding up this apprach is a recursive call of `dfs()` using the left and right values of root and the password being protected.


### Breadth-first Search

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

This problem involves traversing each level of a binary tree and obtaining the values contained at that level. This suits BFS to the bone.

First, the root node is added to a queue, and the queue starts. Values are popped from the beginning of the queue and subsequent children are appended to the end of the queue.

For each level, the values are appended to a list and the list is appended to a bigger list.

The queue keeps running until it is empty. Once this happens, the bigger list is returned and the program ends.


