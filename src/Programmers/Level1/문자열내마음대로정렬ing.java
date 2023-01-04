package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열내마음대로정렬ing {
  public static void main(String[] args) {
    String[] strings = {"sun", "bed", "car"};
    int[] numbers = {3, 1, 2, 4};
    List<Integer> nums = new ArrayList<>();
    int n = 1;
    List<String> answer = new ArrayList<>();
    List<Integer> sample = new ArrayList<>();

//    char a = strings[0].charAt(n);
//    for (int i = 1; i < strings.length; i++) {
//      String s = strings[i];
//      if (a <= strings[i].charAt(n)) System.out.println("a");
//    }
//
    for (int l = 0; l < numbers.length; l++) {
      nums.add(numbers[l]);
    }

//    int p = nums.get(0);
//    for (int i = 0; i < nums.size(); i++) {
//      for (int j = i+1; j < nums.size(); j++) {
//        if (p <= nums.get(j)) p = nums.get(j);
//      }
//      sample.add(p);
//      nums.remove(p);
//    }

//    for (int k = 0; k < answer.size(); k++) {
//      System.out.println(answer.get(k));
//    }

    for (int k = 0; k < sample.size(); k++) {
      System.out.println(sample.get(k));
    }
  }
}
