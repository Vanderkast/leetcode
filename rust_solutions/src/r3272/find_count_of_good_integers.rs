use std::collections::HashSet;

struct Solution;

impl Solution {
    pub fn count_good_integers(n: i32, k: i32) -> i64 {
        if n == 1 || n == 2 {
            return 9 / k as i64;
        }
        let mut palindromes: HashSet<String> = HashSet::new();
        let base = 10_i64.pow(((n - 1) / 2 + 1) as u32);
        for i in base / 10..base {
            let palindrome_str = format!(
                "{}{}",
                i.to_string(),
                i.to_string()
                    .chars()
                    .rev()
                    .skip((n & 1) as usize)
                    .collect::<String>()
            );
            let palindrome: i64 = palindrome_str.parse().unwrap();
            if palindrome % k as i64 == 0 {
                let mut sorted: Vec<char> = palindrome_str.chars().collect();
                sorted.sort();
                palindromes.insert(sorted.into_iter().collect());
            }
        }

        let mut factorial = vec![1_i64; (n + 1) as usize];
        for i in 1..=n as usize {
            factorial[i] = factorial[i - 1] * (i as i64);
        }

        let mut ans = 0_i64;
        for s in palindromes {
            let mut cnt = vec![0; 10];
            for c in s.chars() {
                cnt[c.to_digit(10).unwrap() as usize] += 1;
            }
            let mut tot = (n as i64 - cnt[0] as i64) * factorial[(n - 1) as usize];
            for &x in cnt.iter() {
                tot /= factorial[x];
            }
            ans += tot;
        }
        ans
    }
}

#[cfg(test)]
mod tests {
    use crate::r3272::find_count_of_good_integers::Solution;

    #[test]
    fn leetcode1() {
        let n = 3;
        let k = 5;
        let expected = 27;

        let actual = Solution::count_good_integers(n, k);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let n = 1;
        let k = 4;
        let expected = 2;

        let actual = Solution::count_good_integers(n, k);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let n = 5;
        let k = 6;
        let expected = 2468;

        let actual = Solution::count_good_integers(n, k);

        assert_eq!(expected, actual);
    }
}
