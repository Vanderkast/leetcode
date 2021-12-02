use std::cmp::max;

struct Solution;

impl Solution {
    pub fn max_sub_array(nums: Vec<i32>) -> i32 {
        if nums.len() == 1 {
            nums[0]
        }
        let left = Solution::max_sub_array();
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    fn test(given: Vec<i32>, expected: i32) {
        let actual = Solution::max_sub_array(given);
        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode1() {
        let given = vec![-2, 1, -3, 4, -1, 2, 1, -5, 4];
        let expected = 6;
        test(given, expected);
    }

    #[test]
    fn leetcode2() {
        let given = vec![1];
        let expected = 1;
        test(given, expected);
    }

    #[test]
    fn leetcode3() {
        let given = vec![5, 4, -1, 7, 8];
        let expected = 23;
        test(given, expected);
    }
}
