package Programmers.Level0;

public class 문자열안에문자열 {
  public static void main(String[] args) {
    String str1 = "ab6CDE443fgh22iJKlmn1o";
    String str2 = "6D";

    int answer = 0;
    boolean contains = str1.contains(str2);

    System.out.println(contains);


  }
}
