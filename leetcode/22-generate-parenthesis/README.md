# LC 22 : [Generate Parenthesis]


> **Date:** [2026-06-05]
> **Description:** [LC 22 ](https://leetcode.com/problems/generate-parentheses/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Brute Force]

> **Time Complexity:**
> **Space Complexity:**  

The problem said to generate complete parenthesis matching up to a given number `n`. This means that for every open bracket, there has to be a corresponding closing bracket. In order to do this, we simply track the open bracket counts and return `true` if it equals 0. Also, if at any point, the count falls below 0, it means that there are more closing brackets than opening ones, which mean that we should immediately return `false`.

The rest of the program is straighforward. We recursively append opening and closing brackets to the same string until the count equals the target `n` , at which point, we then check for validity and append it to a resulting array.


``` python
def generateParenthesis(self, n: int) -> List[str]:
	res = []
	
	def valid(s: str):
		open = 0
		for c in s:
			open += 1 if c == '(' else -1
			if open < 0:
				return False

		return True if open == 0 else False

	def dfs(s: str):
		if 2 * n == len(s):
			if valid(s):
				res.append(s)
			return

		dfs(s + '(')
		dfs(s + ')')

	dfs("")
	return res
```

---
*Tags: #dsa #leetcode #backtracking
