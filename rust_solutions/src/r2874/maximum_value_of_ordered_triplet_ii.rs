struct Solution;

impl Solution {
    pub fn maximum_triplet_value(nums: Vec<i32>) -> i64 {
        let mut prefix_max = Vec::<i32>::with_capacity(nums.len());
        let mut suffix_max = Vec::<i32>::with_capacity(nums.len());
        let last_i = nums.len() - 1;
        prefix_max.push(nums[0]);
        for i in 1..last_i {
            prefix_max.push(prefix_max[i - 1].max(nums[i]));
        }
        suffix_max.push(nums[last_i]);
        for i in 1..last_i {
            suffix_max.push(suffix_max[i - 1].max(nums[last_i - i]));
        }
        let mut result = 0i64;
        for i in 1..last_i {
            result = result
                .max((prefix_max[i - 1] - nums[i]) as i64 * suffix_max[last_i - i - 1] as i64);
        }
        result
    }
}

//noinspection ALL
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

    #[test]
    fn leetcode579() {
        let given = vec![10, 13, 6, 2];
        let expected = 14;

        let actual = Solution::maximum_triplet_value(given);

        assert_eq!(expected, actual);
    }
}
