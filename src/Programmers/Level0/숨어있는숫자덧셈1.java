package Programmers.Level0;

public class 숨어있는숫자덧셈1 {
  public static void main(String[] args) {
    String my_string = "aAb1B2cC34oOp";
    int answer = 0;

    for (int i = 0; i < my_string.length(); i++) {
      char c = my_string.charAt(i);
      if (c >= 48 && c<= 57)
      {
        int p = Integer.valueOf(String.valueOf(c));
        answer += p;
      }
    }
    System.out.println(answer);
  }
}
