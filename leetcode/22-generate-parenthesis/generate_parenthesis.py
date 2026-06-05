# LC 22: Generate Parenthesis

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        def valid(s: str):
            open = 0
            for c in s:
                open += 1 if c == '(' else -1
                if open < 0:
                    return False
            return True if open == 0 else False
        
        def dfs(s: str):
            if 2 * n == len(s):
                if valid(s):
                    res.append(s)
                return 
            dfs(s + '(')
            dfs(s + ')')
        
        dfs("")
        return res
        
