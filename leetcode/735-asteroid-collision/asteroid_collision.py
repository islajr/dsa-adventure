"""
LC 735: Asteroid Collision
"""
class Solution:
    def asteroid_collision(self, asteroids: List[int]) -> List[int]:
        stack = []
        for a in asteroids:
            while stack and stack[-1] > 0 and a < 0:
                diff = a + stack[-1]
                if diff < 1:    # negative value is greater
                    stack.pop()
                elif diff > 1:  # positive value is greater
                    a = 0
                else:
                    stack.pop()
                    a = 0
            
            if a != 0:
                stack.append(a)
        return stack
    