# LC 560: Subarray Sum Equals K

> **Description:** [LC 560](https://leetcode.com/problems/subarray-sum-equals-k/description/)
>
> **Difficulty:** Medium


## Approach

### Brute Force

> **Time Complexity:** O(n^2)
>
> **Space Complexity:** O(1)

This approach is built around the idea of testing every combination of elements in the array to return which ones result in `k`.

To achieve this, we define two loops: the first one as a reference point, and the second one to traverse the array for every move the first one makes.

This means that the first loop runs `n` times, and the second loop runs `n!` times.

Anytime a match is identified, a counter is updated and returned at the end of both loops.

