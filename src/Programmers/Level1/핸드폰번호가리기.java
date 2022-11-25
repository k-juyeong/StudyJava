package Programmers.Level1;

public class 핸드폰번호가리기 {
  public static void main(String[] args) {
    String phone_number = "01033334444";
    String answer = "";

    for (int i = 0; i < phone_number.length() - 4; i++) {
      answer += "*";
    }
    for (int j = phone_number.length() - 4; j < phone_number.length(); j++) {
      answer += phone_number.charAt(j);
    }
    System.out.println(answer);
  }
}
