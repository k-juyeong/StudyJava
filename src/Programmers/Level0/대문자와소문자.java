package Programmers.Level0;

public class 대문자와소문자 {
  public static void main(String[] args) {
    String my_string = "abCdEfghIJ";
    String answer = "";


    for (int i = 0; i < my_string.length(); i++) {
      String c = String.valueOf(my_string.charAt(i));
      int a = c.hashCode();
      if (a >= 65 && a <= 90) answer += c.toLowerCase();
      else answer += c.toUpperCase();
    }

    System.out.println(answer);
  }
}
