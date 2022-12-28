package Programmers.Level1;

import java.util.*;

public class 비밀지도 {
  public static void main(String[] args) {
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    String[] answer = new String[arr1.length];

    List<String> binary1 = binary(arr1, n);
    List<String> binary2 = binary(arr2, n);

    for (int i = 0; i < binary1.size(); i++) {
      answer[i] = "";
      for (int j = 0; j < n; j++) {
        if (binary1.get(i).charAt(j) == '1' || binary2.get(i).charAt(j) == '1')
          answer[i] += "#";
        else
          answer[i] += " ";
      }
    }

    System.out.println(Arrays.toString(answer));
  }

  public static List<String> binary(int[] arr, int n) {
    List<String> list = new ArrayList<>();

    for (int a : arr) {
      String s = Integer.toBinaryString(a);

      while (s.length() != n) {
        s = "0" + s;
      }

      list.add(s);
    }
    return list;
  }
}
