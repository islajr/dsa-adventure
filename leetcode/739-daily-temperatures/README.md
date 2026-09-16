# LC 739: [Daily Temperatures]


> **Date:** [YYYY-MM-DD]

> **Description:** [LC 739](https://leetcode.com/problems/daily-temperatures/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Stack|Stack]]

## Approach

### [Stack]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(n)$

This problem provides us with an array of integers `temperatures` where `temperatures[i]` represents the daily temperature on the `ith` day. 

We are required to return an array `result` where `result[i]` is the number of days after the `ith` day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the `ith` day, set `result[i]` to `0` instead.

To solve this, we can use a stack to hold the values of days that are waiting for a future warmer day. This is not intuitive like a brute force approach, but is more effective. Whenever we do find a day that is hotter than the `top` of the stack, within a loop, we compute the number of days that has passed and log that within the results array.

On every count, we make sure to append the temperature and the index to the stack.

``` python
def dailyTemperatures(temperatures: List[int]) -> List[int]:
	res = [0] * len(temperatures)
	stack = []    # [temp, index]
	
	for i, t in enumerate(temperatures):
		while stack and t > stack[-1][0]:
			stack_temp, stack_ind = stack.pop()
			res[stack_ind] = i - stack_ind
		stack.append([t, i])
	return res
```

---
*Tags: #dsa #leetcode #stack
