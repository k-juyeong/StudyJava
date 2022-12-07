package Programmers.Level1;

import java.util.Arrays;

public class x만큼간격있는n개의숫자 {
  public static void main(String[] args) {
    int x = 2;
    int n = 5;

    long[] answer = new long[n];

    for(int i = 0; i < n; i++) {
      long p = (long) x * (i+1);
      answer[i] = p;
    }

    System.out.println(Arrays.toString(answer));
  }
}
