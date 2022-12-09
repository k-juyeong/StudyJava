package Programmers.Level1;

import java.nio.charset.StandardCharsets;

public class 문자열다루기기본 {
  public static void main(String[] args) {
    String s = "1234";
    boolean answer = true;

    if (s.length() == 4 || s.length() == 6) {
      String[] strings = s.split("");
      for (int i = 0; i < strings.length; i++) {
        int hashCode = strings[i].hashCode();
        if (hashCode>=48 && hashCode<=57) continue;
        else {
          answer = false;
          break;
        }
      }
    } else {
      answer = false;
    }

    System.out.println(answer);
  }
}
