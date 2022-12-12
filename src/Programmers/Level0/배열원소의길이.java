package Programmers.Level0;

import java.util.Arrays;

public class 배열원소의길이 {
  public static void main(String[] args) {
    String[] strlist = {"We", "are", "the", "world!"};
    int length = strlist.length;
    int[] answer = new int[length];

    for (int i = 0; i < length; i++) {
      answer[i] = strlist[i].length();
    }

    System.out.println(Arrays.toString(answer));
  }
}
