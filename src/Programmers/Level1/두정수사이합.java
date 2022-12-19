package Programmers.Level1;

public class 두정수사이합 {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;

    long answer = 0;

    if(a>b) {
      for(int i=b; i <= a; i++) {
        answer += i;
      }
    } else if (a == b) {
      answer = a;
    } else {
      for (int j = a; j <= b; j++) {
        answer += j;
      }
    }

    System.out.println(answer);
  }
}
