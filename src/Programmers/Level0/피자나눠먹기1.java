package Programmers.Level0;

public class 피자나눠먹기1 {
  public static void main(String[] args) {
    int n = 15;
    int answer = 0;

    if(n%7 == 0) answer = n/7;
    else answer = n/7+1;

    System.out.println(answer);
  }
}
