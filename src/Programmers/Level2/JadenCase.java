package Programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JadenCase {
  public static void main(String[] args) {
    String s = "9for   6tdfs  fDhe   last   week";
    String[] s2 = s.split(" ");
    List<String> strings = Arrays.asList(s2);
    String answer = "";

    List<String> strings1 = new ArrayList<>();
    strings.forEach(s1 -> {
      if (!s1.equals("")) strings1.add(s1);
    });

    s2 = strings1.toArray(new String[0]);
    System.out.println(Arrays.toString(s2));
    for (int i = 0; i < s2.length; i++) {
      char c = s2[i].charAt(0);
      if ('0' <= c && c <= '9') {
        String s1 = s2[i].toLowerCase();
        s2[i] = s1;
      } else {
        String upperCase = String.valueOf(s2[i].charAt(0)).toUpperCase();
        String lowerCase = s2[i].substring(1).toLowerCase();
        s2[i] = upperCase.concat(lowerCase);
      }
    }
    answer = String.join(" ", s2);
    System.out.println(answer);

  }
}