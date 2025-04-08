struct Solution;

impl Solution {
    pub fn minimum_operations(nums: Vec<i32>) -> i32 {
        let mut seen = [0; 101];
        for i in (0..=nums.len() - 1).rev() {
            seen[nums[i] as usize] += 1;
            if seen[nums[i] as usize] > 1 {
                return (i + 1).div_ceil(3) as i32;
            }
        }
        0
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let given = [1, 2, 3, 4, 2, 3, 3, 5, 7];
        let expected = 2;

        let actual = Solution::minimum_operations(given.to_vec());

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let given = [4, 5, 6, 4, 4];
        let expected = 2;

        let actual = Solution::minimum_operations(given.to_vec());

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let given = [6, 7, 8, 9];
        let expected = 0;

        let actual = Solution::minimum_operations(given.to_vec());

        assert_eq!(expected, actual);
    }
}
