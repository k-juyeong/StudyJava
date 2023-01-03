package Programmers.Level0;

public class 모음제거 {
  public static void main(String[] args) {
    String my_string = "nice to meet you";
    String answer = "";

    my_string = my_string.replace("a", "");
    my_string = my_string.replace("e", "");
    my_string = my_string.replace("i", "");
    my_string = my_string.replace("o", "");
    my_string = my_string.replace("u", "");

    answer = my_string;
    System.out.println(answer);
  }
}
