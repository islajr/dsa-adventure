""" 
LC 42: Trapping Rain Water 
https://leetcode.com/problems/trapping-rain-water/description/

"""
def trap(height):
    """ 
    Approach:
    
    This solution uses a two-pointer approach where each pointer moves inwards depending on which wall is shorter
    The amount of water stored at each point is simply the maximum height less the height at the point
    The result, 'res', variable is updated accordingly and returned.
    There is also a caveat in case the 'height' array is empty (no rainfall).
    
    """
    
    if not height:  # no rainfall
        return 0
    
    l, r = 0, len(height) - 1
    l_max, r_max = height[l], height[r]
    res = 0
    
    while l < r:
        if l_max < r_max:   # shorter left side
            l += 1  # move inwards
            l_max = max(l_max, height[l])
            res += l_max - height[l]
        
        else:   # shorter right side
            r -= 1
            r_max = max(r_max, height[r])
            res += r_max - height[r]
        
        return res         
