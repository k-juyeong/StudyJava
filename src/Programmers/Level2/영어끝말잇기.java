package Programmers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
  public static void main(String[] args) {
    int n = 2;
    String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
    int[] answer = {0, 0};

    List<String> wordList = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      int length = words[i].length();
      String word = words[i];

      // 1글자 이상 체크
      if (length <= 1){
        answer[0] = i%n+1;
        answer[1] = i/n+1;
        break;
      }

      // 끝말잇기 내용 체크
      if (i>=1) {
        String s = wordList.get(i - 1);
        if (s.charAt(s.length()-1) != word.charAt(0)) {
          answer[0] = i%n+1;
          answer[1] = i/n+1;
          break;
        }
      }

      // 중복 체크
      if (wordList.contains(word)){
        answer[0] = i%n+1;
        answer[1] = i/n+1;
        break;
      } else {
        wordList.add(words[i]);
      }

    }


    System.out.println(Arrays.toString(answer));
  }
}
