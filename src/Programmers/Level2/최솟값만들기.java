package Programmers.Level2;

import java.util.Arrays;

public class 최솟값만들기 {
  public static void main(String[] args) {
    int []A = {1,2};
    int []B = {3,4};
    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[(A.length-1)-i];
    }

    System.out.println(answer);
  }
}
