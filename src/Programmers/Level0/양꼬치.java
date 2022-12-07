package Programmers.Level0;

public class 양꼬치 {
  public static void main(String[] args) {
    int n = 64;
    int k = 6;
    int answer = 0;

    int freeDrink = n/10;
    answer = n*12000 + (k-freeDrink)*2000;

    System.out.println(answer);
  }
}
