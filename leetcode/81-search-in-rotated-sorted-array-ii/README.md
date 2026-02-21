# LC 81: Search in Rotated Sorted Array II

> **Description:** [LC 81](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)

## Approach

The rotated nature of the list `nums` alludes to the idea that at least one part of the list is sorted.

This approach adapts binary search to this idea by comparing the median to both extremes indexes of the list and looking through each partition as needed.

In cases where `nums[l] == nums[m]`, and it is impossible to determine the sorted partition the left pointer is incremented sequentially till it becomes possible.
