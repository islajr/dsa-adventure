# LC 242: [Valid Anagram]


> **Date:** [2026-06-26]
> **Description:** [LC 242](https://leetcode.com/problems/valid-anagram/description)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Arrays]]

## Approach

### [Sorting]

> **Time Complexity:**
> **Space Complexity:**  

We can start by looking at what an anagram is: It is a word or phrase formed by re-arranging the letters of another word or phrase. The question gives two strings and leaves us to decipher if one is an anagram of the other.

A good place to start would be by comparing lengths. If they don't tally, it's definitely false.
We can then move on to sorting the strings and then check if they equal one another. The result of this comparison is the final answer.

``` python
def is_anagram(s: str, t: str) -> bool:
	if len(s) != len(t):
		return false
	
	return sorted(s) == sorted(t)
```

---
*Tags: #dsa #leetcode #arrays
