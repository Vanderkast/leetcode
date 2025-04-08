struct Solution;

impl Solution {
    pub fn kids_with_candies(candies: Vec<i32>, extra_candies: i32) -> Vec<bool> {
        let max = candies.iter().max().unwrap().clone();
        let mut result: Vec<bool> = Vec::with_capacity(candies.len());
        for c in candies {
            result.push(c + extra_candies >= max);
        }

        result
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let candies = vec![2, 3, 5, 1, 3];
        let extra_candies = 3;
        let expected = vec![true, true, true, false, true];

        let actual = Solution::kids_with_candies(candies, extra_candies);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let candies = vec![4, 2, 1, 1, 2];
        let extra_candies = 1;
        let expected = vec![true, false, false, false, false];

        let actual = Solution::kids_with_candies(candies, extra_candies);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let candies = vec![12, 1, 12];
        let extra_candies = 10;
        let expected = vec![true, false, true];

        let actual = Solution::kids_with_candies(candies, extra_candies);

        assert_eq!(expected, actual);
    }
}
