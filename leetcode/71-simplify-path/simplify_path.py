""" 
LC 71: Simplify Path
"""
class Solution:
    def simplify_path(self, path: str) -> str:
        stack = []
        paths = path.split("/")
        
        for path in paths:
            if path == "..":
                if stack:
                    stack.pop()
            elif path != "." and path != "":
                stack.append(path)
        
        return "/" + "/".join(stack)