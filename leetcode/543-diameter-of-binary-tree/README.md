# LC 543: Diameter of Binary Tree

> **Description:** [LC 543](https://leetcode.com/problems/diameter-of-binary-tree/description/)
>
> **Difficulty:** Easy
>


## Approach

The diamater of a binary tree is the longest path between any two nodes. Nodes contain two children at each point, and as such, the length is `left subtree height + right subtree height`


### Brute Force

> **Time Complexity:** O(n^2)
>
> **Space Complexity:** O(n) — Recursion Stack

This approach builds on the earlier definition of how the diameter of a binary tree is computed. 

In order to achieve this, this approach checks for this formula at every node, comparing it to the longest recorded diameter and selecting the maximum value. 

This is rather slow and inefficient because there are two recursion stack for computing the height of the binary tree and computing the diameter.


### Recursive DFS

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(h) — Recursive Stack

While computing heights with DFS, it is possible to simultaneously track the maximum `left + right` seen so far to produce the diameter in one pass.

This approach tracks and updates the diameter as the height of each sub-tree is computed recursively. Once the recursion stack is exhausted, it returns the stored max diameter.

This is arguably cleaner and makes better use of resources, harnessing the recursion stack to complete the entire operation in one pass.


**Specific Java Quirk**

Since Java is pass-by-value, using a plain integer to track the diameter will not work. This is because each new recursive call gets it's own copy and fails to update the actual variable.

To combat this, this approach uses arrays. Java will pass the reference to the array by value and update it accordingly.


