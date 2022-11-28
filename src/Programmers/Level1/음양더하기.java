package Programmers.Level1;

import java.util.Arrays;

public class 음양더하기 {
  public static void main(String[] args) {
    int[] absolutes = {4, 7, 12};
    boolean[] signs = {true, false, true};
    int answer = 0;

    for (int i = 0; i < signs.length; i++) {
      int h = absolutes[i];
      if (!signs[i])
        absolutes[i] = -h;
    }

    for (int a : absolutes) {
      answer += a;
    }
    System.out.println(answer);
  }
}
