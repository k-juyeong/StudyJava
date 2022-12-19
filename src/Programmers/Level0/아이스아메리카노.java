package Programmers.Level0;

import java.util.Arrays;

public class 아이스아메리카노 {
  public static void main(String[] args) {
    int money = 15000;
    int[] answer = new int[2];
    int price = 5500;

    answer[0] = money/price;
    answer[1] = money%price;

    System.out.println(Arrays.toString(answer));
  }
}
