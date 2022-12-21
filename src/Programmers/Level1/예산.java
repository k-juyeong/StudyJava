package Programmers.Level1;

import java.util.Arrays;

public class 예산 {
  public static void main(String[] args) {
    int[] d = {2,2,3,3};
    int budget = 10;
    int answer = 0;

    Arrays.sort(d);

    for (int i = 0; i < d.length; i++) {
      if ((budget -= d[i]) >= 0) answer++;
      else break;
    }

    System.out.println(answer);
  }
}
