package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열자르기 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int num1 = 1;
    int num2 = 3;
    int[] answer = new int[num2-num1+1];
    List<Integer> list = new ArrayList<>();

    for (int i = num1; i <= num2; i++) {
      list.add(numbers[i]);
    }

    for (int j = 0; j < answer.length; j++) {
      answer[j] = list.get(j);
    }

    System.out.println(Arrays.toString(answer));
  }
}
