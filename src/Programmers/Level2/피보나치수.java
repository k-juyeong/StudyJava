package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

public class 피보나치수 {
  public static void main(String[] args) {
    int n = 3;
    int answer = 0;

    List<Integer> pList = new ArrayList<>();
    pList.add(0);
    pList.add(1);

    for (int i = 2; i <= 100000; i++) {
      pList.add((pList.get(i - 2) + pList.get(i - 1))%1234567);
    }

    answer =  pList.get(n);
    System.out.println(answer);
  }
}
