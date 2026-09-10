# LC 20: [Valid Parenthesis]


> **Date:** [2026-09-10]

> **Description:** [LC 20](https://leetcode.com/problems/valid-parentheses/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Stack|Stack]]

## Approach

### [Stack]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(n)$

This is problem presents us with a deterministic set of parenthesis and then creates a string `s` containing certain combinations. The requirement is easy -- opening and closing brackets must correspond accordingly. In order to solve this, we use a stack to keep track of the history and the latest opening bracket. We also keep a map of closing to opening brackets for $O(1)$ lookups at each point. 

The main body of the algorithm is to check whether we've got an opening bracket or not. If we do, we append to the stack. If we don't, we check the stack if the next element matches the corresponding opening bracket. If it does, we pop it from the stack and if it doesn't, we simply return `false`. We see the program to the end and then only return `true` if the stack is empty. 

``` python
def is_valid(s: str) -> bool:
	stack = []
	pairings = { "}" : "{", ")" : "(", "]" : "[" }
	for c in s:
		if c in pairings:
			if stack and stack[-1] == pairings[c]:
				stack.pop()
			else:
				return False
		else:
			stack.append(c)
	return True if not stack else False
```

---
*Tags: #dsa #leetcode #stack
