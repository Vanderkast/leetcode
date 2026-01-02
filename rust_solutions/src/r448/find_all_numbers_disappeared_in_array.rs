struct Solution;

impl Solution {
    pub fn find_disappeared_numbers(nums: Vec<i32>) -> Vec<i32> {
        let mut dissappeared: Vec<i32> = (1..=nums.len()).map(|i| i as i32).collect();

        for num in nums {
            dissappeared[(num - 1) as usize] = -1;
        }

        dissappeared.into_iter().filter(|n| *n != -1).collect()
    }
}

pub fn test(given: Vec<i32>, expected: Vec<i32>) {
    let actual = Solution::find_disappeared_numbers(given);
    assert_eq!(expected, actual);
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        test(vec![4, 3, 2, 7, 8, 2, 3, 1], vec![5, 6]);
    }

    #[test]
    fn leetcode2() {
        test(vec![1, 1], vec![2]);
    }
}
