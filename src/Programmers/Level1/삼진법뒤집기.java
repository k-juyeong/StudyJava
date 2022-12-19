package Programmers.Level1;

public class 삼진법뒤집기 {
  public static void main(String[] args) {
    int n = 2;
    long answer = 0;
    String a = "";

    if (n < 3) a = "" + n;

    while (n >= 3) {
      a += n%3;
      n = n/3;
      if (n < 3) a += n;
    }

    int l = a.length();
    for (int i = l - 1; i >= 0; i--) {
      int j = Integer.parseInt(String.valueOf(a.charAt(i)));
      int pow = (int) Math.pow(3, l - (i + 1));
      answer += j * pow;
    }

    System.out.println(a);
    System.out.println(answer);
  }
}
