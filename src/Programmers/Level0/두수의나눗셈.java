package Programmers.Level0;

public class 두수의나눗셈 {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 16;
    int answer = 0;

    double v = num1 / (num2 * 1.0);
    System.out.println(v);


    answer = (int) (Math.floor(v * 1000));

    System.out.println(answer);
  }
}
