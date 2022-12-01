package Programmers.Level2;

public class 다음큰숫자 {
  public static void main(String[] args) {
    int n = 78;
    int answer = 0;
    int cnt = 0;
    int cnt2 = 0;

    String s = Integer.toBinaryString(n);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') cnt++;
    }

    for (int j = n + 1; j > n; j++) {
      String j1 = Integer.toBinaryString(j);
      for (int k = 0; k < j1.length(); k++) {
        if (j1.charAt(k) == '1') cnt2++;
      }
      if (cnt == cnt2) answer = j;
      else cnt2 = 0;
      if (answer != 0) break;
    }

    System.out.println(answer);
  }
}
