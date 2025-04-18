struct Solution;

impl Solution {
    pub fn count_and_say(n: i32) -> String {
        let mut prev: Vec<i32> = Vec::new();
        prev.push(1);
        for _ in 1..n {
            let mut seq: Vec<i32> = Vec::new();
            let mut count = 1;
            for i in 1..prev.len() {
                if prev[i] == prev[i - 1] {
                    count += 1;
                } else {
                    seq.push(count);
                    seq.push(prev[i - 1]);
                    count = 1;
                }
            }
            seq.push(count);
            seq.push(* prev.last().unwrap());
            prev = seq;
        }

        prev.into_iter().map(|x| x.to_string()).collect()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let n = 4;
        let expected = "1211";

        let actual = Solution::count_and_say(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let n = 1;
        let expected = "1";

        let actual = Solution::count_and_say(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn test5() {
        let n = 5;
        let expected = "111221";

        let actual = Solution::count_and_say(n);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode5() {
        let n = 6;
        let expected = "312211";

        let actual = Solution::count_and_say(n);

        assert_eq!(expected, actual);
    }
}
