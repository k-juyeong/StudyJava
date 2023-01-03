package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class n의배수고르기 {
  public static void main(String[] args) {
    int n = 3;
    int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
    List<Integer> answer = new ArrayList<>();

    for (int i : numlist) {
      if (i % n == 0) answer.add(i);
    }

    for (int a : answer) {
      System.out.println(a);
    }
  }
}
