package Programmers.Level0;

public class 문자반복출력하기 {
  public static void main(String[] args) {
    String my_string = "hello";
    int n = 3;
    String answer = "";

//    for (int i = 0; i < my_string.length(); i++) {
//      for (int j = 0; j < n; j++) {
//        answer += my_string.charAt(i);
//      }
//    }

    String[] strings = my_string.split("");
    for (String s : strings) {
      for (int i = 0; i < n; i++) {
        answer += s;
      }
    }

    System.out.println(answer);
  }
}
