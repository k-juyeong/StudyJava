package Leetcode.Easy;

import java.util.*;

public class PalindromeNumber {
  public static void main(String[] args) {
    int x = 0;
    boolean answer = false;

    String s = String.valueOf(x);
    int l = s.length();

    List<Integer> num = new ArrayList<>();
    List<Integer> num2 = new ArrayList<>();

    if (x > 0) {
      for (int i = 0; i < l; i++) {
        num.add(Integer.valueOf(String.valueOf(s.charAt(i))));
        num2.add(Integer.valueOf(String.valueOf(s.charAt(l-1-i))));
      }
    }


//    System.out.println(num.equals(num2));
    if (x > 0 && num.equals(num2)) answer = true;

    System.out.println(answer);

  }
}
