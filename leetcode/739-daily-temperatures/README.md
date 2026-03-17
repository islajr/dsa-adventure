# LC 739: Daily Temperatures

> **Description:** [LC 739](https://leetcode.com/problems/daily-temperatures/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

## Approach

This approach uses a **stack** to solve the problem. A result array is initialized and pre-populated with zeros. A stack is then created to store the indexes and temperatures still waiting for a warmer date

Looping through the `temperatures`, whenever each reading is higher than the `top` of the stack, the top value is `popped`, and the corresponding index is computed and logged within `result`.
