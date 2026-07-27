# LC 18: [4Sum]


> **Date:** [2026-07-26]
> **Description:** [LC 18 ](https://leetcode.com/problems/4sum/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#Two Pointers|Two Pointers]]

## Approach

### [Sorting]

> **Time Complexity:** O(n ^ 3)
> **Space Complexity:**  O(1)

The logic used in [[LC 1 - Two Sum]] and [[LC 15 - 3Sum]] naturally extends here. We use the same sorting algorithm, adjusted for four elements, this time. Due to the four elements, we have to fix two elements by using a nested loop and ensuring that these two elements are distinct. 

Once we fix both, we then set up both pointers like before, checking for a match between all possible combinations, adjusting the pointer based on whether the observed value is too high or too low. 

We also do not forget to skip possible duplicates at both eneds of the pointers. 


``` python
def four_sum(nums: List[int], int target) -> List[List[int]]:
	nums.sort()
	res = []
	n = len(nums)
	
	for i in range(n):
		# check and skip duplicates
		if > 0 and nums[i] == nums[i - 1]:
			continue
		
		# second loop
		for j in range(i + 1, n):
			# check and skip duplicates
			if j > i + 1 and nums[j ]== nums[j - 1]:
				continue
			l, r = j + 1, n - 1
			while l < r:
				inner_sum = nums[i] + nums[j] + nums[l] + nums[r]
				if inner_sum == target:
					res.append([nums[i] + nums[j] + nums[l] + nums[r]])
					left += 1
					right -= 1
					
					# skip LHS duplicates
					while l < r and nums[l] == nums[l - 1]:
						l += 1
					# skip RHS duplicates
					while l < r and nums[r] == nums[r + 1]:
						r -= 1
				elif inner_sum < target:
					left += 1
				else:
					right -= 1
	return res
			
```

---
*Tags: #dsa #leetcode #two-pointers 
