package Programmers.Level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {
  public static void main(String[] args) {
    int[] sides = {1, 2, 3};
    int answer = 2;

    Arrays.sort(sides);

    if (sides[2] < sides[0] + sides[1]) answer = 1;

    System.out.println(answer);
  }
}
