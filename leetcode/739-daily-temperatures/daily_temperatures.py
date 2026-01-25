class Solution:
    """ 
    Given an array of integers temperatures represents the daily temperatures, 
    return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. 
    
    If there is no future day for which this is possible, keep answer[i] == 0 instead.
    """
    
    @classmethod
    def daily_temperatures(self, temperatures: list[int]) -> list[int]:
        result = [0] * len(temperatures)
        stack = []  # temp, index
        
        for i, t in enumerate(temperatures):
            while stack and t > stack[-1][1]:
                top_temp, top_index = stack.pop()
                result[top_index] = i - top_index
                
            stack.append((t, i))
        return result
    
def main():
    print(Solution.daily_temperatures(temperatures = [30, 40, 50, 60]))

if __name__ ==  "__main__":
    main()
    