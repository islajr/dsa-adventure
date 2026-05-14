# LC 104: Maximum Depth of Binary Tree

> **Description:** [LC 104](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
>
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** Worst Case -- O(n) | Best Case -- O(log(n))

## Approach

### Recursive DFS

This approach uses the formula: `depth of a tree = 1 + max depth of left and right subtrees`. 

It is a recursive Depth-First Search approach that computes the depth of the binary tree by exploring every node.

This means that for each node, we recursively compute the depths of both left and right sub-trees, taking the maximum of both and adding 1 for the current node.

### Breadth-First Search

> 
> **Difficulty:** Easy
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

Breadth-first Search (BFS) traverses the breadth of a tree, level by level using a queue as opposed to DFS which goes as deep as possible and uses a stack.

This problem uses the queue notion of BFS, adding the root node to a queue and incrementing a counter for every level traversed.

For every level to be checked, if the children do not possess null values, they are also added to the queue.

The whole process repeats until the queue is empty and the counter is returned as the depth.

