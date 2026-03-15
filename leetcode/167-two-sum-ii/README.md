# LC 167: Two Sum II - Input Array Is Sorted

> **Description:** [LC 167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n log n)
>
> **Space Complexity:** O(1)

## Approach

Given that the input array is sorted, it is possible to identify sub-values that add up to the target value using binary search.

A window is established that initially spans the entire array, but reduces in logarithmic time `log n`, and once a suitable combination is found, the indices, incremented by 1, are returned as requested.
