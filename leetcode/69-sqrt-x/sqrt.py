"""
LC 69 - Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.
"""
class Solution:
    def sqrt(self, x: int) -> int:
        l, r = 0, x
        res = 0

        while l <= r:
            m = (l + r) // 2

            if m * m > x:
                r = m - 1
            elif m * m < x:
                l = m + 1
                res = m
            else:
                return m
        
        return res


