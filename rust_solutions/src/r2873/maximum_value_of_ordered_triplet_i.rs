struct Solution;

impl Solution {
    pub fn maximum_triplet_value(nums: Vec<i32>) -> i64 {
        let mut result = 0i64;
        for i in 0..nums.len() {
            for j in i + 1..nums.len() {
                for k in j + 1..nums.len() {
                    result = result.max((nums[i] - nums[j]) as i64 * nums[k] as i64);
                }
            }
        }
        result
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let given = vec![12, 6, 1, 2, 7];
        let expected = 77;

        let actual = Solution::maximum_triplet_value(given);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let given = vec![1, 10, 3, 4, 19];
        let expected = 133;

        let actual = Solution::maximum_triplet_value(given);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let given = vec![1, 2, 3];
        let expected = 0;

        let actual = Solution::maximum_triplet_value(given);

        assert_eq!(expected, actual);
    }
}
