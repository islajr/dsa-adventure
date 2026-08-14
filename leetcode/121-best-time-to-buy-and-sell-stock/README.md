# LC 121: [Best Time to Buy and Sell Stock]


> **Date:** [2026-08-14]
> **Description:** [LC 121 ](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Sliding Window|Sliding Window]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(n^2)$
> **Space Complexity:** $O(1)$

The most intuitive approach is to use a nested loop, as is the case for any **sliding window** problem. Here, we simply maintain two loops and three variables: one to store the maximum profit value and two for the loop. This way, we check all possible combinations and only update the `maximum_profit` value when we find something higher. Very intuitive; not efficient.


``` python
def maxProfit(prices: List[int]) -> int:
	max_profit = 0
	
	for i in range(len(prices)):
		for j in range(i + 1, len(prices)):
			profit = prices[j] - prices[i]
			max_profit = max(max_profit, profit)
	return max_profit
```

### [Sliding Window]

> **Time Complexity:** $O(n)$
> **Space Complexity:** $O(1)$

Instead of checking every possible combination, we lean into the specifications of the question a bit more. We need the highest non-negative profit value. This is simplifies things. Now, we start with a real small window: indexes `0, 1`. We compare the values at both of these indexes. If the right is greater, we compare it with `max_profit` and store the maximum value as always, but if it's less than the left value, the right value becomes the new left value, and the new right value becomes that, but incremented by one. This ensures that we only go through the loop once at worst-case.

```python
def maxProfit(prices: List[int]) -> int:
	max_profit = 0
	l, r = 0, 1
	
	while r < len(prices):
		if prices[r] < prices[l]:
			l = r
		elif prices[r] > prices[l]:
			max_profit = max(max_profit, prices[r] - prices[l])
		r += 1 
	return max_profit
```

---
*Tags: #dsa #leetcode #sliding-window 
