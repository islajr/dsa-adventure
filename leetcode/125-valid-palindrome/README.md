# LC 125: [Valid Palindrome]


> **Date:** [2026-09-03]
> **Description:** [LC 125](https://leetcode.com/problems/valid-palindrome/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Two Pointer|Two Pointer]]

## Approach

### [Reverse String]

> **Time Complexity:** $O(n)$
> **Space Complexity:** $O(n)$

This problem requires us to check whether a provided string `s` is a palindrome. A palindrome is a string that forms the same word when viewed forwards and backwards. The examples also indicate that non-alphanumeric values are skipped and that the palindrome checker should be case-insensitive. A good first approach would be the check if the string `s` is the same when it is viewed forwards and reversed. In order to do this, we curate a new string consisting only of alphanumeric values and lower case characters for homogenity. We then simply compare the string to its reversed version and return the value.

``` python
class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_str = ""
        for c in s:
            if c.isalnum():
                new_str += c.lower()
        return new_str == new_str[::-1]
```

---

### [Two Pointer]

> **Time Complexity:** $O(n)$
> **Space Complexity:** $O(1)$

A better approach would be to use two pointers at both ends of the string `s`. We skip duplicates as expected, and compare only on alphanumeric strings. This is better in that there is constant space complexity.

``` python
class Solution:
    def isPalindrome(self, s: str) -> bool:
        l, r = 0, len(s) - 1
        while l < r:
	        while l < r and not s[l].isalnum():
		        l += 1
		    while l < r and not s[r].isalnum():
			    r -= 1
			if s[l].isalnum() and s[r].isalnum():
				if s[l].lower() != s[r].lower():
					return False
			l, r = l + 1, r - 1
		return True
```

*Tags: #dsa #leetcode #two-pointers
