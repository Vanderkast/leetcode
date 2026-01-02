struct Solution;

impl Solution {
    pub fn single_non_duplicate(nums: Vec<i32>) -> i32 {
        let mut left = 0;
        let mut right = nums.len() - 1;
        let mut mid: usize;
        while left < right {
            mid = (left + right) / 2;
            if (mid % 2 == 0 && nums[mid] == nums[mid + 1])
                || (mid % 2 == 1 && nums[mid] == nums[mid - 1])
            {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        nums[left]
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    fn test(given: Vec<i32>, expected: i32) {
        let actual = Solution::single_non_duplicate(given);
        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode1() {
        test(vec![1, 1, 2, 3, 3, 4, 4, 8, 8], 2)
    }

    #[test]
    fn leetcode2() {
        test(vec![3, 3, 7, 7, 10, 11, 11], 10)
    }

    #[test]
    fn single_element() {
        test(vec![1], 1);
    }
}
