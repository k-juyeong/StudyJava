package Programmers.Level1;

import java.util.*;

public class 같은숫자는싫어 {
  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    int[] answer = {};
    List<Integer> numbers = new ArrayList<>();
    numbers.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      if (arr[i-1] != arr[i]) numbers.add(arr[i]);
    }

    answer = new int[numbers.size()];

    for (int j = 0; j < numbers.size(); j++) {
      answer[j] = numbers.get(j);
    }

    System.out.println(Arrays.toString(answer));
  }
}
