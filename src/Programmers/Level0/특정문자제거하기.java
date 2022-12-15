package Programmers.Level0;

public class 특정문자제거하기 {
  public static void main(String[] args) {
    String my_string = "abcdef";
    String letter = "f";
    String answer = "";

    answer = my_string.replace(letter, "");

    System.out.println(answer);
  }
}
