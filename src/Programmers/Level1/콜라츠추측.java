package Programmers.Level1;

public class 콜라츠추측 {
  public static void main(String[] args) {
    int num = 6;
    int answer = 0;
    int cnt = 0;
    long n = num;

    while(n != 1) {
      cnt++;

      if(n%2 == 0) n = n/2;
      else n = (n*3) + 1;

      if(n == 1 || cnt >= 500) break;
    }

    if(cnt >= 500) answer = -1;
    else answer = cnt;

    System.out.println(answer);
  }
}
