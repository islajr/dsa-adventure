# LC 17: [Letter Combinations of a Phone Number]


> **Date:** [2026-06-13]
> **Description:** [LC 17](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]]

## Approach

### [Backtracking]

> **Time Complexity:**
> **Space Complexity:**  

The question provides good information about what is expected, namely all possible letter combinations of a phone number, given the combination code and mapping. To this end, all we need do is create a that mapping in our code using a hashmap or dictionary.

From here on, it is almost trivial. Given a combination of any digits, we explore all possible combinations step-by-step, looking at one digit at a time, and exploring all possible characters for that digit. Backtracking should let us explore all of this efficiently.

Since it possible that `digits` can be empty, we only search if it is not, otherwise, we return an empty string.

``` python
def letter_combinations(digits: str) -> List[str]:
	res = []
	digitToChar = {
	"2": "abc",
	"3": "def",
	"4": "ghi",
	"5": "jkl",
	"6": "mno",
	"7": "pqrs",
	"8": "tuv",
	"9": "wxyz",
	}
	
	def backtrack(i, curr):
		if len(curr) == len(digits):
			res.append(curr)
			return
		for c in digitToChar[digits[i]]:
			backtrack(i + 1, curr + c)
	
	if digits:
		backtrack(0, "")
	
	return res
	
```

---
*Tags: #dsa #leetcode #backtracking
