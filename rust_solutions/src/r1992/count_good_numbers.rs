struct Solution;

impl Solution {
    pub fn count_good_numbers(n: i64) -> i32 {
        (Solution::bin_pow(5, (n + 1) / 2) * Solution::bin_pow(4, n / 2) % 1_000_000_007_i64) as i32
    }

    fn bin_pow(mut a: i64, mut power: i64) -> i64 {
        let mut res = 1_i64;
        while power > 0 {
            if power & 1 == 1 {
                res = res * a % 1_000_000_007_i64;
            }
            a = a * a % 1_000_000_007_i64;
            power >>= 1;
        }
        res
    }
}
#[cfg(test)]
mod tests {
    use crate::r1992::count_good_numbers::Solution;

    #[test]
    fn leetcode1() {
        let n = 1;
        let expected = 5;

        let actual = Solution::count_good_numbers(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let n = 4;
        let expected = 400;

        let actual = Solution::count_good_numbers(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let n = 50;
        let expected = 564908303;

        let actual = Solution::count_good_numbers(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode69() {
        let n = 806166225460393;
        let expected = 643535977;

        let actual = Solution::count_good_numbers(n);

        assert_eq!(expected, actual);
    }
}
