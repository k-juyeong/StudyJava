package Programmers.Level0;

public class 제곱수판별 {
  public static void main(String[] args) {
    int n = 144;
    int answer = 2;

    for (int i = 0; i < n; i++) {
      long round = Math.round(Math.pow(i, 2));
      if (round == n) {
        answer = 1;
        break;
      }
      if (round > n) break;
    }

    System.out.println(answer);
  }
}
