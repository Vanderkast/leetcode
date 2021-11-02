struct Solution {}

impl Solution {
    pub fn sorted_squares(numbers: Vec<i32>) -> Vec<i32> {
        let length = numbers.len();
        let mut i_positive = 0;
        while i_positive < length && numbers[i_positive] < 0 {
            i_positive += 1;
        }

        let mut squares = Vec::with_capacity(length);

        if i_positive == 0 { // numbers are all positive
            for i in 0..length {
                squares.push(numbers[i] * numbers[i]);
            }
        } else if i_positive == length { // numbers are all negative
            for i in (0..length).rev() {
                squares.push(numbers[i] * numbers[i]);
            }
        } else { // general case
            let mut i_negative = i_positive - 1;
            let mut negative = numbers[i_negative] * numbers[i_negative];
            let mut positive: i32;
            while i_positive < length {
                positive = numbers[i_positive] * numbers[i_positive];
                if positive < negative {
                    squares.push(positive);
                    i_positive += 1;
                } else {
                    squares.push(negative);
                    i_negative = match i_negative.checked_sub(1) {
                        None => {
                            break;
                        }
                        Some(i) => {
                            i
                        }
                    };
                    negative = numbers[i_negative] * numbers[i_negative];
                }
            }
            for i_positive in i_positive..length {
                squares.push(numbers[i_positive] * numbers[i_positive]);
            }
        }

        squares
    }
}

fn main() {
    assert_eq!(vec![0, 1, 4, 49], Solution::sorted_squares(vec![0, 1, 2, 7]));
    assert_eq!(vec![-2, 0], Solution::sorted_squares(vec![0, 4]));
    assert_eq!(vec![1], Solution::sorted_squares(vec![-1]));
    assert_eq!(vec![16, 25], Solution::sorted_squares(vec![-5, -4]));
    assert_eq!(vec![49], Solution::sorted_squares(vec![7]));
    assert_eq!(vec![0, 1, 9, 16, 100], Solution::sorted_squares(vec![-4, -1, 0, 3, 10]));
    assert_eq!(vec![4, 9, 9, 49, 121], Solution::sorted_squares(vec![-7, -3, 2, 3, 11]));
    assert_eq!(vec![0, 0, 25, 49, 99980001, 100000000, 100000000],
               Solution::sorted_squares(vec![-10000, -9999, -7, -5, 0, 0, 10000]));
}
