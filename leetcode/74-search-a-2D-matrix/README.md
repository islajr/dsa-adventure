# LC 74: [Search a 2D Matrix]


> **Date:** [2026-10-12]

> **Description:** [LC 74](https://leetcode.com/problems/search-a-2d-matrix/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(m*n)$

> **Space Complexity:** $O(1)$

This problem provides us with a 2D integer array `matrix` and an integer `target` where each row is sorted in non-decreasing order and the first integer of every row is greater than the last integer of the previous row. Essentially, moving from left to right from the top row of the matrix, the numbers increase sequentially.

The brute force approach checks every element until it finds the `target` value as shown below

``` python
def searchMatrix(matrix: List[List[int]], target: int) -> bool:
	for i in range(len(natrix)):
		for j in range(len(matrix[i])):
			if matrix[i][j] == target:
				return True
	return False
```

---

### [Staircase Search]

> **Time Complexity:** $O(m + n)$

> **Space Complexity:** $O(1)$

The [[LC 74 - Search a 2D Matrix#[Brute Force|Brute Force]] approach worked, but is naively inefficient due to its quadratic time complexity. In order to improve on it, we have to capitalize on the specific quirks of our matrix. Given that columns and rows are both sorted in non-decreasing order, we can start at the **top right corner** of the matrix and the work our way either downwards or leftwards, depending on what is observed.

If the current cell value is higher that the `target`, we move **leftwards**, as we need to reduce the values. If the cell value is lower than the `target`, we move **downwards**, as we need to increase values. This algorithm mimics the motion of descending a staircase, hence the name. If the `target` value is found, we return `true`; otherwise, we return `false`.

``` python
def searchMatrix(matrix: List[List[int]], target: int) -> bool:
	m, n = len(matrix), len(matrix[0])
	r, c = 0, n - 1
	
	while m > r and c >= 0:
		if matrix[r][c] > target:
			c -= 1
		elif matrix[r][c] < target:
			r += 1
		else:
			return True
	return False
```
---
### [Binary Search]

> **Time Complexity:** $O(\log m + \log n)$

> **Space Complexity:** $O(1)$

Another approach would be to capitalize on the attributes of the matrix array. We need to be able to find the specific row that a `target` could exist within by checking first and last elements -- essentially **a first binary search**. When we find one suitable, we simply need to search inside of that row with **a second binary search**. This eliminates large portions of the matrix at every step while fully capitalizing on the sorted structure of the matrix.

``` java
public boolean searchMatrix(int[][] matrix, int target) {
	int ROWS = matrix.length; 
	int COLS = matrix[0].length;
	
	int top = 0, bot = ROWS - 1;
	while (top <= bot) {
		int row = (top + bot) / 2;
		if (target > matrix[row][COLS - 1]) top = row + 1;
		else if (target < matrix[row][0]) bot = row - 1;
		else break;
	}
	if (!(top <= bot)) return false;
	int row = (top + bot) / 2;
	int l = 0, r = COLS - 1;
	
	while (l <= r) {
		int m = (l + r) / 2;
		if (target > matrix[row][m]) l = m + 1;
		else if (target < matrix[row][m]) r = m - 1;
		else return true;
	}
	return false;
}
```

---
*Tags: #dsa #leetcode #binary-search* 
