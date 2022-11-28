package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 없는숫자더하기 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
    int answer = 0;

    for (int a : numbers) {
      answer += a;
    }

    answer = 45-answer;
    System.out.println(answer);
  }
}
