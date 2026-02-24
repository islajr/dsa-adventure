# LC 162: Find Peak Element

> **Description:** [LC 162](https://leetcode.com/problems/find-peak-element/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(log n)
>
> **Space Complexity:** O(1)

## Approach

This is a binary search problem to find the peak element(s) in an array. To do this, we compute midpoints at all feasible points within the array `nums`.

At each midpoint, there should be a `peak`. If the midpoint `nums[m]` is smaller than `nums[m - 1]`, then the peak must exist on the left side. The same is true for the right side also.

Otherwise, the midpoint itself is a `peak`.
