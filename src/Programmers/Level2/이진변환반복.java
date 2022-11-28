package Programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 이진변환반복 {
  public static void main(String[] args) {
    String s = "01110";
    int[] answer = new int[2];

    while(!s.equals("1")) {
      answer[0]++;
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '0') answer[1]++;
      }
      s = s.replace("0", "");
      int l = s.length();
      s = Integer.toBinaryString(l);
    }

//    System.out.println(Arrays.toString(answer));
  }
}
