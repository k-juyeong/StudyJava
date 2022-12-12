package Programmers.Level1;

import java.util.Arrays;

public class 행렬의덧셈 {
  public static void main(String[] args) {
    int[][] arr1 = {{1}, {2}};
    int[][] arr2 = {{3}, {4}};
    int[][] answer = new int[arr1.length][arr1[0].length];

    if (arr1[0].length > 1) {
      for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1[i].length; j++) {
          answer[i][j] = arr1[i][j] + arr2[i][j];
        }
      }
    } else {
      for (int i = 0; i < arr1.length; i++) {
          answer[i][0] = arr1[i][0] + arr2[i][0];
      }
    }

    System.out.println(Arrays.toString(answer));
  }
}
