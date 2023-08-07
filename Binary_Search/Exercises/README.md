## 1

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

# Example 1:

- Input: nums = [1,3,5,6], target = 5
- Output: 2

# Example 2:

- Input: nums = [1,3,5,6], target = 2
- Output: 1

# Example 3:

- Input: nums = [1,3,5,6], target = 7
- Output: 4

# Constraints:

- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains distinct values sorted in ascending order.
- -10^4 <= target <= 10^4

## 2

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x \*\* 0.5 in python.

# Example 1:

- Input: x = 4
- Output: 2
- Explanation: The square root of 4 is 2, so we return 2.
- Example 2:

# Example 2

- Input: x = 8
- Output: 2
- Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

# Constraints:

- 0 <= x <= 231 - 1
