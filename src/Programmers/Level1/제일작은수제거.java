package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거 {
  public static void main(String[] args) {
    int[] arr = {5, 8, -4, 4, 3, 2, 1};
    int[] answer = {};
    int[] arr2 = arr.clone();
    List<Integer> a = new ArrayList<>();

    Arrays.sort(arr2);

    if (arr.length == 1) {
      answer = new int[1];
      answer[0] = -1;
    }
    else {
      answer = new int[arr.length - 1];
      int h = arr[0];
      for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr.length; j++) {
          if (h > arr[j]) h = arr[j];
        }
      }
      int finalH = h;
      Arrays.stream(arr).forEach(i -> {
        if (i != finalH) {
          a.add(i);
        }
      });
      System.out.println(a);
      for (int i = 0; i < answer.length; i++) {
        answer[i] = a.get(i);
      }
    }
    System.out.println(Arrays.toString(answer));
  }
}
