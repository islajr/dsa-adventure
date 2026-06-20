# LC 473: [Matchsticks to Square]


> **Date:** [2026-06-20]
> **Description:** [LC 473 ](https://leetcode.com/problems/matchsticks-to-square/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking — Brute Force]

> **Time Complexity:** O(4 ^ n)
> **Space Complexity:**  O(n)

The problem is one of backtracking, where we are given multiple 'matchsticks' of varying lengths, and tasked with making a square using **all** matchsticks exactly once without breaking any of them.

To solve this, we could try to recursively place all matchsticks on each of the four sides of the resulting square, and if all sides have equal length, we have a valid square. 

A relatively quick process of elimination could then follow with the checking of whether the sum of the matchsticks lengths are even divisible by 4. If not, we return `False` immediately.

We can then create an array to track the current lengths of each of the four sides and then add each matchstick to all four sides. After placing a matchstick, we recurse to place the next one. If we place all four and the sides are equal, we're golden. Otherwise, we backtrack by removing the matchsticks from their current sides before trying the next side.


``` python
class Solution:
    def makesquare(self, matchsticks: List[int]) -> bool:
        if sum(matchsticks) % 4 != 0:
            return False

        sides = [0] * 4

        def dfs(i):
            if i == len(matchsticks):
                return sides[0] == sides[1] == sides[2] == sides[3]

            for side in range(4):
                sides[side] += matchsticks[i]
                if dfs(i + 1):
                    return True
                sides[side] -= matchsticks[i]

            return False

        return dfs(0)
```

---
*Tags: #dsa #leetcode #backtracking
