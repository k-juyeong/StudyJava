package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수는싫어요 {
  public static void main(String[] args) {
    int n = 15;
    int[] answer = {};
    List<Integer> nums = new ArrayList<>();

    if (n % 2 == 0) answer = new int[n/2];
    else answer = new int[n/2+1];

    for (int i=1; i<=n; i+=2) {
      nums.add(i);
    }

    for (int i = 0; i < answer.length; i++) {
      answer[i] = nums.get(i);
    }

    System.out.println(Arrays.toString(answer));
  }
}
