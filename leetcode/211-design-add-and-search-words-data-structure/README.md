# LC 211: Design Add and Search Words Data Structure

> **Description:** [LC 211](https://leetcode.com/problems/design-add-and-search-words-data-structure/description/)
>
> **Difficulty:** Medium


## Approach

### Recursive DFS

> **Time Complexity:** O(n) for both operations
>
> **Space Complexity:** O(t + n)

This problem says to design a data structure for adding and searching words, but with the caveat that the search operation may contain a period `.`.

The presence of this period signifies the need for pattern-matching and selection of any words depending on where the period is located.

For the add operation, the mere definition of a prefix tree insertion operation is enough. See [here](https://github.com/islajr/dsa-adventure/blob/main/leetcode/208-implement-trie-prefix-tree/README.md) for a detailed explanation.

The main bone of contention is the search operation and the troublesome `.`.

Since the problem only requires us to return a boolean value if there is at least one matching word, it simplifies the problem. If the word to be searched contains a period, we recursively look through the child nodes contained at every node and reurn true if there are non-null characters and false if otherwise.

For non-period characters, the search operation is handled the same as in a normal prefix tree. The pointer is also moved accordingly and returns the boolean value check for `endOfWord`.

