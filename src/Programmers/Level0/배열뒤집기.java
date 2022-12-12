package Programmers.Level0;

import java.util.Arrays;

public class 배열뒤집기 {
  public static void main(String[] args) {
    int[] num_list = {1,2,3,4,5};
    int length = num_list.length;
    int[] answer = new int[length];

    for (int i= 0; i < length; i++) {
      answer[i] = num_list[length-1-i];
    }

    System.out.println(Arrays.toString(answer));
  }
}
