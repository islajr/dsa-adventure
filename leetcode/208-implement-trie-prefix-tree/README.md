# LC 208: Implement Trie (Prefix Tree)

> **Description:** [LC 208](https://leetcode.com/problems/implement-trie-prefix-tree/)
>
> **Difficulty:** Medium


## Approach

### Array

> **Time Complexity:** O(n)
>
> **Space Complexity:** O(n)

A Trie data structure is a variant of a tree data structure that is ridiculously efficient for search operations.

In order to implement a prefix tree, we have to mock a trie data structure. This is done by maintaining a 26-character array (signalling characters of the english alphabet). This is then passed when the Prefix Tree is instantiated. 

In order to implement search functionality, the word to be searched is converted into a character array and each character is matched with characters in the Trie's character array. If a match is found and the character node is actually the end of the word, the algorithm returns true. Otherwise, it returns false;

Insertion is roughly similar to search and has the same approach. However, for insertion, what matters more is to mark the final node as the end of the word. This is important in order to facilitate future search operations.

In order to check if a word starts with a specific prefix, the approach is also similar. This is what a trie is built for. If a match is found after following the steps above, we return true. Otherwise, we return false.

