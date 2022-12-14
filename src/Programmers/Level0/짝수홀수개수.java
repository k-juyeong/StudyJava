package Programmers.Level0;

import java.util.Arrays;

public class 짝수홀수개수 {
  public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4, 5};
    int[] answer = {0, 0};

    for (int i : num_list) {
      if (i%2 == 0) answer[0]++;
      else answer[1]++;
    }

    System.out.println(Arrays.toString(answer));
  }
}
