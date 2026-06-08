# LC 79: Word Search

class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS, COLS = len(board), len(board[0])
        path = set()

        def dfs(rows, cols, index):
            if index == len(word):
                return True
            
            if (min(rows, cols) < 0 or 
            rows >= ROWS or cols >= COLS or
            word[index] != board[rows][cols] or
            (rows, cols) in path
            ):
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
        
