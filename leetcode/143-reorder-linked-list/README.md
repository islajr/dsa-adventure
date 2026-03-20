# LC 143: Reorder Linked List

> **Description:** [LC 143](https://leetcode.com/problems/reorder-list/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(1)

## Approach

Reordering the list into the pattern: `L1->Ln->L2->Ln-1->l3->...` could involve breaking the problem down into three major steps:

1. Finding the middle of the linked list using **fast and slow pointers**. This implies that when the fast pointer gets to the end of the list, the slow pointer is only halfway.

2. Reversing the second half of the list. This can be achieved by the linked list reverse algorithm.

3. Merging both halves together one-by-one. One node is taken from the first half, and one from the second half in repetitive order.
