# LC 128: Longest Consecutive Sequence

> **Description:** [LC 128](https://leetcode.com/problems/longest-consecutive-sequence/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(1)

## Approach

Since the problem is to find the longest consecutive sequence in O(n) time, it makes sense to convert the list: `nums` into a hash set.

To find the beginning of a valid sequence and avoid double-counting, we only count where `num - 1` does not exist in the hash set. This is the beginning of the sequence.

Each iteration after that simply works on the premise of whether `num + sequence_length` exists in the set or not.
