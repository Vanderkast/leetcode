use std::collections::HashSet;

struct Solution;

impl Solution {
    pub fn repeated_n_times(nums: Vec<i32>) -> i32 {
        let n = nums.len() / 2;
        let mut visited = HashSet::<i32>::with_capacity(n + 1);
        let mut iter = nums.iter();
        loop {
            let x = iter.next().unwrap();
            if visited.contains(x) {
                return *x;
            }
            visited.insert(*x);
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::*;

    #[rstest]
    #[case::example_1(vec![1, 2, 3, 3], 3)]
    #[case::example_1(vec![2, 1, 2, 5, 3, 2], 2)]
    #[case::example_1(vec![5, 1, 5, 2, 5, 3, 5, 4], 5)]
    fn test(#[case] given: Vec<i32>, #[case] expected: i32) {
        let actual = Solution::repeated_n_times(given);
        assert_eq!(expected, actual);
    }
}
