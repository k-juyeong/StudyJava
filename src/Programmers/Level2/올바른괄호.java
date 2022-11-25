package Programmers.Level2;

import java.util.Arrays;

public class 올바른괄호 {
  public static void main(String[] args) {
    String s = "()())(()";
    boolean answer = true;
    int l = s.length();
    if (l%2 == 1 || s.charAt(0) == ')' || s.charAt(l-1) == '(')
      answer = false;
    else if (s.charAt(l-3) == '(' && s.charAt(l-3) == '(')
      answer = false;
    else {
      int cnt = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') cnt++;
        else cnt--;
      }
      if (cnt != 0) answer = false;
    }

    System.out.println(answer);
  }
}
