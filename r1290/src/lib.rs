struct Solution;

impl Solution {
    pub fn get_decimal_value(head: Option<Box<ListNode>>) -> i32 {
        let mut cursor = head;
        let mut current: Box<ListNode>;
        let mut reversed_bits = 0;
        let mut bit_index = -1;
        while cursor.is_some() {
            bit_index += 1;
            current = cursor.unwrap();
            if current.val == 1 {
                reversed_bits += 1 << bit_index;
            }
            cursor = current.next;
        }
        let mut result = 0;
        for i in 0..bit_index {
            if reversed_bits & (1 << i) > 0 {
                result += 1 << (bit_index - i);
            } else {
                result <<= 1;
            }
        }
        result
    }
}

#[derive(PartialEq, Eq, Clone, Debug)]
pub struct ListNode {
  pub val: i32,
  pub next: Option<Box<ListNode>>
}

impl ListNode {
  #[inline]
  fn new(val: i32) -> Self {
    ListNode {
      next: None,
      val
    }
  }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn leetcode1() {

    }
}
