def longest_consecutive_sequence(nums: list[int]) -> int:
    nums_set = set(nums)
    longest = 0
    
    for num in nums_set:
        if num - 1 not in nums:
            length = 1  # beginning of sequence
            while num + length in nums_set:
                length += 1
            longest = max(length, longest)  # update 'longest' 
        else:
            continue
       
    
    return longest

if __name__ == "__main__":
    print(longest_consecutive_sequence([0,3,7,2,5,8,4,6,0,1]))
    