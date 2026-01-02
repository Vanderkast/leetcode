struct Solution;

impl Solution {
    pub fn bitwise_complement(mut n: i32) -> i32 {
        if n == 0 {
            return 1;
        }
        let mut compliment = 0;
        let mut tmp = 1;
        while n > 0 {
            if n & 1 == 0 {
                compliment += tmp;
            }
            tmp <<= 1;
            n /= 2;
        }
        compliment
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        // given
        let n = 5;
        let expected = 2;
        // when
        let actual = Solution::bitwise_complement(n);
        // then
        assert_eq![expected, actual]
    }

    #[test]
    fn zero() {
        // given
        let n = 0;
        let expected = 1;
        // when
        let actual = Solution::bitwise_complement(n);
        // then
        assert_eq![expected, actual]
    }

    #[test]
    fn leetcode2() {
        // given
        let n = 7;
        let expected = 0;
        // when
        let actual = Solution::bitwise_complement(n);
        // then
        assert_eq![expected, actual]
    }

    #[test]
    fn leetcode3() {
        // given
        let n = 10;
        let expected = 5;
        // when
        let actual = Solution::bitwise_complement(n);
        // then
        assert_eq![expected, actual]
    }
}
