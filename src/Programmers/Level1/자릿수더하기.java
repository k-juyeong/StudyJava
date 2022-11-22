package Programmers.Level1;

public class 자릿수더하기 {
  public static void main(String[] args) {
    int n = 123;
    int answer = 0;


    for(int i=0; i<String.valueOf(n).length(); i++){
      answer += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
    }

    System.out.println(answer);
  }
}
