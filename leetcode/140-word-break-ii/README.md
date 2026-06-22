# LC 140: [Word Break II]


> **Date:** [2026-06-22]
> **Description:** [LC 140](https://leetcode.com/problems/word-break-ii/description/)
> **Difficulty:** [Hard]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking]

> **Time Complexity:**
> **Space Complexity:**  

This problem is an extended version of [[LC 139 - Word Break]] where we were tasked with checking if a provided string `s` could be successfully split into words in a dictionary `wordDict`. This problem tells us to constrcut a sentence from `s` where each word is a valid `wordDict` word.

This approach will use backtracking to explore every possible viable path. First, we convert the array `wordDict` into a set for O(1) lookups. Then we get into the thick of the solution.

If the programme gets to the final index of `s`, we know it was successful, so we append some whitespace and store it appropriately. This is the base case.

The main part of the code is a loop that goes from the current index till the end of the string `s`,  where substrings are constructed from the current index `i` of string `s` to the index of the loop counter `j`.  At each stage, we check for the presence of the substring in `wordDict` and if we get a match, we store it and move on to the next index from the loop counter `j + 1`. Otherwise, we backtrack by 'popping' the stored value. See the code below:

``` python
def wordBreak(s: str, wordDict: List[str]) -> List[str]:
	wordDict = set(wordDict)
	
	def backtrack(i):
		# base case
		if i == len(s):
			res.append(" ".join(curr))
		
		for j in range(i, len(s)):
			sub = s[i : j + 1]
			if sub in wordDict:
				# recursive case
				curr.append(sub)
				backtrack(j + 1)
			
				# backtrack case
				curr.pop()
	res = []
	curr = []
	backtrack(0)
	
	return res
```

---
*Tags: #dsa #leetcode #backtracking
