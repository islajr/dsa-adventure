# LC 735: Asteroid Collision

> **Description:** [LC 735](https://leetcode.com/problems/asteroid-collision/description/)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

## Approach

This approach uses a **stack** to solve the problem. Only positive values are appended to the stack intially for comparison. 

Negative values are tested against the top element and the smaller element is eradicated.

Edge cases are handled by eradicating both values.

Negative values remaining in the `asteroids` list are then appended to the stack and returned.
