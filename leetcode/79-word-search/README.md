# LC 79: [Word Search]


> **Date:** [2026-06-10]
> **Description:** [LC 79 ](https://leetcode.com/problems/word-search/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking]

> **Time Complexity:**
> **Space Complexity:**  

The [problem description](https://leetcode.com/problems/word-search/description/) says that we are interested in looking for a certain `word` from within a  `grid` (rows x columns) of letters. To solve this, we try to start the word at every grid. if the current grid letter matches the current character, we then try to move out to all four neighbouring cells (up, left, down, and right), backtracking where appropriate. If the word is ever found, we return `true` and `false` if otherwise


``` python
def word_search(board: List[List[str]], word: str) -> bool:

	ROWS, COLS = len(board), len(board[0])
	path = set()
	
	def dfs(rows, cols, index):
		# base case
		if index == len(word):
			return True
		
		# base case for negative returns
		if (min(rows, cols) < 0 or    # out of bounds
		word[index] != board[rows][cols] or    # mismatch or incorrect match
		(rows, cols) in path):    # already visited
			return False
		
		path.add((rows, cols))
		res = (dfs(rows + 1, cols, index + 1) or 
			dfs(rows - 1, cols, index + 1) or
			dfs(rows, cols + 1, index + 1) or
			dfs(rows, cols - 1, index + 1))
		path.remove((rows, cols))
		return res
	
	for r in range(ROWS):
		for c in range(COLS):
			if dfs(r, c, 0):
				return True
	return False

```

---
*Tags: #dsa #leetcode #backtracking
