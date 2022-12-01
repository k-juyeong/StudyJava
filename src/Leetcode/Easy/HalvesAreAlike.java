package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class HalvesAreAlike {
  public static void main(String[] args) {
    String s = "book";
    boolean answer = false;

    s = s.toLowerCase();
    int l = s.length();
    String a = s.substring(0, l/2);
    String b = s.substring(l/2, l);
    int cnt = 0;

    List<String> vowels = new ArrayList<>();
    vowels.add("a");
    vowels.add("e");
    vowels.add("i");
    vowels.add("o");
    vowels.add("u");

    for (int i = 0; i < a.length(); i++) {
      if(vowels.contains(String.valueOf(a.charAt(i)))) cnt++;
      if(vowels.contains(String.valueOf(b.charAt(i)))) cnt--;
    }

    if (cnt == 0) answer = true;

    System.out.println(answer);
  }
}
