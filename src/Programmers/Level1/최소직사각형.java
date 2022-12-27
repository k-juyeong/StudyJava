package Programmers.Level1;

import java.util.Arrays;

public class 최소직사각형 {
  public static void main(String[] args) {
    int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    int answer = 0;

    for (int[] a : sizes) {
      Arrays.sort(a);
    }

    int k = sizes[0][0];
    int l = sizes[0][1];
    for (int i = 0; i < sizes.length; i++) {
      if (k < sizes[i][0]) k = sizes[i][0];
      if (l < sizes[i][1]) l = sizes[i][1];
    }

    answer = k * l;

    System.out.println(answer);
  }
}
