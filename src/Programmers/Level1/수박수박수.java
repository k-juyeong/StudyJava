package Programmers.Level1;

public class 수박수박수 {
  public static void main(String[] args) {
    int n = 4;
    String answer = "";
    String s = "";
    String s2 = "";

    for (int i = 0; i < n; i++) {
      answer += (i%2 == 0 ) ? "수" : "박";
    }

    System.out.println(answer);
  }
}
