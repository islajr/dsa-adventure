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

### [Backtracking — Pruning]

> **Time Complexity:** 
> **Space Complexity:**

The previous approach explored many redundant branches, leading to an [exponential time complexity](https://en.wikipedia.org/wiki/Time_complexity). This approach makes two key optimizations that leads to a significant improvement in time complexity. First one is to sort the array in reverse order so as to fail fast. The second one is the most crucial, and it is to skip placing a matchstick on an empty side if we have tried another empty side because since they are all the same length, they are interchangable. 

As for the algorithm, we improve on the previous solution by floor-dividing the sum of all matchstick lengths into four so as to find the length per side. After this, we sort the array in reverse.

Since we only explore valid decision branches until the end, we need only check for the base case before terminating and returning true.

While choosing whether and how to explore each branch, we only proceed if the branch is viable (i.e.: if the addition of the  next matchstick fits into the computed length-per-side variable). Once we confirm that, most of the solution flows the same way, with us confirming true if the recursive addition comes back as true and backtracking otherwise.

The second optimization comes at the end of each loop iteration with a check of whether the just explored side is zero. If so, we terminate that branch entirely, thus saving time and resources, leading to a faster algorithm.

``` python
def makesquare(matchsticks: List[int]) -> bool:
	if sum(matchticks)% 4 != 0
		return False
	
	length = sum(matchsticks) // 4    # length of each side
	sides = [0] * 4
	matchsticks.sort(reverse=True)
	
	def dfs(i):
		# base case
		if i == len(matchsticks):
			return True
		
		for side in len(sides):
			if sides[side] + matchsticks[i] <= length:
				sides[side] += matchsticks[i]
				if dfs(i + 1):
					return True
				sides[side] -= matchsticks[i]
				
			if sides[side] == 0:
				break;
		return False
	
	dfs(0)

```

---

*Tags: #dsa #leetcode #backtracking
