package Programmers.Level2;

public class 짝지어제거 {
  public static void main(String[] args) {
    String s = "cc";
    int answer = 0;
    int[] result = remove(s);


    while(result[1] == 0) {
      int i = result[0];
      if (i == -1) break;
      else if (i == 0) s = s.substring(2);
      else s = s.substring(0, i) + s.substring(i+2);

      result = remove(s);
    }


    if (s.length() == 0) answer = 1;

    System.out.println(s);
    System.out.println(answer);
  }
  public static int[] remove(String s){
    int[] result = {-1, 0};
    for (int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)){
        result[0] = i;
        break;
      }
    }

    if (result[0] == -1) result[1] = 1;
    return result;
  }
}
