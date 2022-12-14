package Programmers.Level0;

public class 피자나눠먹기3 {
  public static void main(String[] args) {
    int slice = 7;
    int n = 12;
    int answer = 0;

    if (n%slice == 0) answer = n/slice;
    else answer = n/slice+1;

    System.out.println(answer);
  }
}
