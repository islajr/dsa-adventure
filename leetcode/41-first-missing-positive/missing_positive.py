"""
LC 41: First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

"""
class Solution:
    def first_missing_positive(self, nums: List[int]) -> int:
        nums.sort()
        number = 1

        for num in number:
            if num > 0 and num == number:
                number += 1
        return number


def main():
    sol = Solution.first_missing_positive([1, 2, 3, 4, 5])
    print(sol)


if __name == "__main__":
    main()

