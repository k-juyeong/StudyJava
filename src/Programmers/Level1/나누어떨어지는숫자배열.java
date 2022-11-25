package Programmers.Level1;

import java.util.*;

public class 나누어떨어지는숫자배열 {
  public static void main(String[] args) {
    int[] arr = {3, 2, 6};
    int[] answer = {};
    List<Integer> a = new ArrayList();

    int divisor = 10;

    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]%divisor == 0) a.add(arr[i]);
    }

    if (a.size() == 0) answer = new int[1];
    else answer = new int[a.size()];

    for (int j = 0; j < answer.length; j++) {
      answer[j] = (a.size() == 0) ? -1 : a.get(j);
    }

    System.out.println(Arrays.toString(answer));
  }
}
