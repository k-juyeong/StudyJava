package Programmers.Level1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
  public static void main(String[] args) {
    int n = 3;
    int m = 12;
    int[] answer = {1, 1};

    for (int i = 1; i <= Integer.max(n, m); i++) {
      if (n%i == 0 && m%i ==0) answer[0] = i;
    }

    if (answer[0] == 1) answer[1] = n * m;
    else answer[1] = answer[0] * (n / answer[0]) * (m / answer[0]);

    System.out.println(Arrays.toString(answer));
  }
}
