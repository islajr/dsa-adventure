# LC 2: Add Two Numbers

> **Description:** [LC 2](https://leetcode.com/problems/add-two-numbers/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(m + n)
>
> **Space Complexity:** O(1)

## Approach

The problem involves reversing the content of two linked lists, adding them, and returning it reversed.

First, a dummy node is initialized,together with an empty `carry` variable.

With the traversal of each node in linked lists `l1` and `l2`, both the `sum` and the `carry` are computed, and the pointers are updated to move forward.

The loop ends when all of `l1`, `l2`, and `carry` are null.
