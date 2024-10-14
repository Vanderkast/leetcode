use std::collections::BinaryHeap;

struct Solution;

impl Solution {
    pub fn max_kelements(nums: Vec<i32>, k: i32) -> i64 {
        let mut queue = BinaryHeap::from(nums);
        let mut score = 0i64;
        for _ in 0..k as usize {
            let s = queue.pop().unwrap();
            score += s as i64;
            if s % 3 > 0 {
                queue.push(s / 3 + 1);
            } else {
                queue.push(s / 3);
            }
        }
        score
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let nums = vec![10, 10, 10, 10, 10];
        let k = 5;

        let score = Solution::max_kelements(nums, k);

        assert_eq!(score, 50);
    }

    #[test]
    fn leetcode2() {
        let nums = vec![1, 10, 3, 3, 3];
        let k = 3;

        let score = Solution::max_kelements(nums, k);

        assert_eq!(score, 17);
    }

    #[test]
    fn test_element_is_ceiling_div_after_use() {
        let nums = vec![10];
        let k = 2;

        let score = Solution::max_kelements(nums, k);

        assert_eq!(score, 14);
    }
}