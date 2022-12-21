package Programmers.Level1;

public class 서울에서김서방찾기 {
  public static void main(String[] args) {
    String[] seoul = {"Jane", "Kim"};

    String answer = "";
    int cnt = -1;

    for(String a:seoul) {
      cnt++;

      if(a.equals("Kim")) answer =  "김서방은 " + cnt + "에 있다";
    }

    System.out.println(answer);
  }
}
