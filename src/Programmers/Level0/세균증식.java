package Programmers.Level0;

public class 세균증식 {
  public static void main(String[] args) {
    int n = 7;
    int t = 15;
    int answer = 0;

    int pow = (int) Math.floor(Math.pow(2, t));
    answer = n * pow;
    System.out.println(answer);
  }
}
