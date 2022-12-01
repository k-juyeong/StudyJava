package Programmers.Level2;

import java.util.Arrays;

public class 카펫 {
  public static void main(String[] args) {
    int brown = 8;
    int yellow = 1;

    int[] answer = new int[2];

    for (int i = 1; i <= yellow; i++) {
      if (yellow%i == 0) {
        int d = yellow/i;
        if(((d+2)*(i+2)-d*i) == brown) {
//          if(i>=d) {
//            answer[0] = i+2;
//            answer[1] = d+2;
//          } else {
//            answer[0] = d+2;
//            answer[1] = i+2;
//          }
          answer[0] = (i >= d) ? i+2 : d+2;
          answer[1] = (i >= d) ? d+2 : i+2;
          break;
        }
      }
    }

    System.out.println(Arrays.toString(answer));
  }
}
