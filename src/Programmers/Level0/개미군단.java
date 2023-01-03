package Programmers.Level0;

public class 개미군단 {
  public static void main(String[] args) {
    int hp = 999;
    int answer = 0;

    while (hp != 0) {
      answer += hp/5;
      hp = hp%5;
      answer += hp/3;
      hp = hp%3;
      answer += hp/1;
      hp = hp%1;
    }

    System.out.println(answer);
  }
}
