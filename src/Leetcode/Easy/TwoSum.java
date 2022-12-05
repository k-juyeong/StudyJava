package Leetcode.Easy;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {3, 3};
    int target = 6;
    int[] answer = {0, 0};

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target){
          answer[0] = i;
          answer[1] = j;
        }
      }
    }

    System.out.println(Arrays.toString(answer));
  }
}
