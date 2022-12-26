package Programmers.Level0;

import java.util.Arrays;

public class 중앙값구하기 {
  public static void main(String[] args) {
    int[] array = {1, 2, 7, 10, 11};
    int answer = 0;

    Arrays.sort(array);

    int center = array.length/2;
    answer = array[center];

    System.out.println(answer);
  }
}
