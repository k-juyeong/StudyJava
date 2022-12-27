package Programmers.Level0;

public class 자릿수더하기 {
  public static void main(String[] args) {
    int n = 1234;
    int answer = 0;

    String s = String.valueOf(n);

    for (int i = 0; i < s.length(); i++) {
      answer += Integer.valueOf(String.valueOf(s.charAt(i)));
    }

    System.out.println(answer);
  }
}
