package Programmers.Level1;

public class 가운데글자가져오기 {
  public static void main(String[] args) {
    String s = "abcde";
    String answer = "";

    int l = s.length();
    answer = (l%2 == 0) ? String.valueOf(s.charAt(l/2-1))+s.charAt(l/2) : String.valueOf(s.charAt(l/2));

    System.out.println(answer);
  }
}
