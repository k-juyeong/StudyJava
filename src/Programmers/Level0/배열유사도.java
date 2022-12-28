package Programmers.Level0;

public class 배열유사도 {
  public static void main(String[] args) {
    String[] s1 = {"a", "b", "c"};
    String[] s2 = {"com", "b", "d", "p", "c"};
    int answer = 0;

    for (String s : s1) {
      for (String a : s2) {
        if (s.equals(a)) answer++;
      }
    }
    System.out.println(answer);
  }
}
