package Programmers.Level1;

public class 부족한금액계산하기 {
  public static void main(String[] args) {
    int price = 3;
    int money = 20;
    int count = 4;
    int result = 0;
    long answer = 0;

    for (int i = 1; i <= count; i++) {
      result += price*i;
    }
    result = money - result;

    if (result<0) answer = Math.abs(result);

    System.out.println(answer);
  }
}
