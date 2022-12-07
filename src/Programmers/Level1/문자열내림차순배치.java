package Programmers.Level1;

import java.util.Arrays;

public class 문자열내림차순배치 {
  public static void main(String[] args) {
    String s = "Zbcdefg";
    String answer = "";

    String[] strings = s.split("");

    for (int i = 1; i < strings.length; i++) {
      for (int j = i; j>0; j--){
        if (strings[j-1].compareTo(strings[j]) < 0)
          exch(strings, j-1, j);
        else break;
      }
    }

    for (int i = 0; i < strings.length; i++) {
      answer += strings[i];
    }

//    answer = Arrays.toString(strings);
    System.out.println(answer);
//    System.out.println(Arrays.toString(strings));

  }

  public static String[] exch(String[] strings, int i, int j) {
    String s = strings[i];
    strings[i] = strings[j];
    strings[j] = s;

    return strings;
  }
}
