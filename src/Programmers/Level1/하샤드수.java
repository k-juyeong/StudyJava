package Programmers.Level1;

public class 하샤드수 {
  public static void main(String[] args) {
    int x = 13;

    boolean answer = true;
    int sum = 0;
    int y = x;

    for(int i=0; i<String.valueOf(x).length(); i++) {
      sum += y%10;
      y = y/10;
    }

    if(x%sum != 0) {
      answer = false;
    }

    System.out.println(answer);
  }
}
