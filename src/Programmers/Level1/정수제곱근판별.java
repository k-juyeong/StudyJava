package Programmers.Level1;

public class 정수제곱근판별 {
  public static void main(String[] args) {
    int n = 121;
    long answer = 0;

    if(n == 1){
      answer = 4;
    }else{
      for(double i=2; i<=n; i++){
        if(n == (long)(Math.pow(i,2))){
          double x = Math.pow((i+1),2);
          answer = (long) x;
          break;
        }
      }
    }

    if(answer == 0){
      answer = -1;
    }
    System.out.println(answer);
  }
}
