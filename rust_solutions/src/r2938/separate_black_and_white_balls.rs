struct Solution;

impl Solution {
    pub fn minimum_steps(s: String) -> i64 {
        let mut swap_count = 0i64;
        let mut s_iter = s.chars().enumerate();

        let mut first_one_index = 0;
        while let Some((i, s)) = s_iter.next() {
            if s == '1' {
                first_one_index = i;
                break;
            }
        }

        while let Some((i, s)) = s_iter.next() {
            if s == '0' {
                swap_count += (i - first_one_index) as i64;
                first_one_index += 1;
            }
        }

        swap_count
    }
}

#[cfg(test)]
mod tests {
    use super::Solution;

    #[test]
    fn test_leetcode1() {
        let s = "101".to_string();

        let actual = Solution::minimum_steps(s);

        assert_eq!(actual, 1)
    }

    #[test]
    fn test_leetcode2() {
        let s = "100".to_string();

        let actual = Solution::minimum_steps(s);

        assert_eq!(actual, 2)
    }

    #[test]
    fn test_leetcode3() {
        let s = "0111".to_string();

        let actual = Solution::minimum_steps(s);

        assert_eq!(actual, 0)
    }

    #[test]
    fn test_all_zeroes() {
        let s = "000".to_string();

        let actual = Solution::minimum_steps(s);

        assert_eq!(actual, 0)
    }

    #[test]
    fn test_all_ones() {
        let s = "111".to_string();

        let actual = Solution::minimum_steps(s);

        assert_eq!(actual, 0)
    }
}
