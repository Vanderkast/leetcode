use std::cmp::max;

struct Solution;

impl Solution {
    pub fn count_days(days: i32, mut meetings: Vec<Vec<i32>>) -> i32 {
        meetings.sort_by(|a, b| a[0].cmp(&b[0]));
        let mut free_days = meetings[0][0] - 1;
        let mut last_day_meeting = meetings[0][1];
        for i in 1..meetings.len() {
            let meeting = &meetings[i];
            if meeting[0] > last_day_meeting {
                free_days += meeting[0] - last_day_meeting - 1;
                last_day_meeting = meeting[1];
            } else {
                last_day_meeting = max(last_day_meeting, meeting[1]);
            }
        }
        free_days + days - max(last_day_meeting, meetings.last().unwrap()[1])
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {
        let days = 10;
        let meetings = vec![vec![5, 7], vec![1, 3], vec![9, 10]];
        let expected = 2;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode2() {
        let days = 5;
        let meetings = vec![vec![2, 4], vec![1, 3]];
        let expected = 1;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn leetcode3() {
        let days = 6;
        let meetings = vec![vec![1, 6]];
        let expected = 0;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn single_meeting_from_start() {
        let days = 10;
        let meetings = vec![vec![1, 5]];
        let expected = 5;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn single_meeting_to_end() {
        let days = 10;
        let meetings = vec![vec![5, 10]];
        let expected = 4;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn single_meeting_middle() {
        let days = 10;
        let meetings = vec![vec![3, 8]];
        let expected = 4;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }

    #[test]
    fn meeting_inside_another_meeting() {
        let days = 10;
        let meetings = vec![vec![3, 8], vec![4, 7]];
        let expected = 4;

        let actual = Solution::count_days(days, meetings);

        assert_eq!(expected, actual);
    }
}
