# LC 71: Simplify Path

> **Description:** [LC 71](https://leetcode.com/problems/simplify-path/description)
>
> **Difficulty:** Medium
>
> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

## Approach

This approach solves the problem quite easily by using a stack, and capitalizing on a feature of the python programming language.

Python allows the string manipulation method `.split()` that takes in a delimiter and splits a string into various parts using said delimiter.

For this problem, this will be the `/` character. Analyzing the resulting list after that is simply a matter of comparison.

If the list contains `..` and the stack is not empty, the `pop()` method is called. Any other character except `.` and `""`, which are essentially blanks, are appended to the stack.

The stack is then rejoined - preceeded by the `/` character and joined by the same.
