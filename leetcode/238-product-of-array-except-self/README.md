# LC 238: [Product of Array Except Self]


> **Date:** [2026-07-02]
> **Description:** [LC 238](https://leetcode.com/problems/product-of-array-except-self/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Arrays]]]

## Approach

### [Brute Force]

> **Time Complexity:** O(n ^ 2)
> **Space Complexity:**  O(1)

This problem tasks us with finding the product of all elements in an array and returning them in-place. To do this, we could go for a very inefficient brute force approach where each the product of each element is computed and skipped at the specific element and then appended to a list. This is trivial to implement.

``` python
def product_except_self(nums: List[int]) -> List[int]:
	prod = 1
	res = []
	
	for i in range(len(nums)):
		for j in range(len(nums)):
			if j != 1:
				prod = prod * nums[j]
		res.append(prod)
		prod = 1
	return res
```
---

### [Sorting]

> **Time Complexity:** O(n)
> **Space Complexity:** O(n)

The above solution leads to a Time Limit Exceeded Exception on LeetCode. It is simply too inefficient. Optimizing this solution evolves things a step further. Instead of re-computing products on every run, we simply pre-compute it and then use it repeatedly. We create arrays that represent the products of prefixes and suffixes of each element. We then simply compute the final array by finding the product of each index of the prefix and suffix arrays.

``` python
def product_except_self(nums: List[int]) -> List[int]:
	n = len(nums)
	pref = [0] * n
	suff = [0] * n
	res = [0] * n
	
	pref[0] = suff[n - 1] = 1
	
	for i in range(1, n):
		pref[i] = pref[i - 1] * nums[i - 1]
	
	for i in range(n - 2, -1, -1):
		suff[i] = suff[i + 1] * nums[i + 1]
	
	for i in range(n):
		res[i] = pref[i] * suff[i]
	
	return res
```

---
*Tags: #dsa #leetcode #arrays
