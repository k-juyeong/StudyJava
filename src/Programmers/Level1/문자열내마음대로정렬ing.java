package Programmers.Level1;

import java.util.Arrays;

public class 문자열내마음대로정렬ing {
  public static void main(String[] args) {
    String[] strings = {"sun", "bed", "car"};
    int n = 1;
    String[] answer = {};

    char a = strings[0].charAt(n);
    for (int i = 1; i < strings.length; i++) {
      String s = strings[i];
      if (a <= strings[i].charAt(n)) {

      }
    }

    System.out.println(Arrays.toString(answer));
  }
}
