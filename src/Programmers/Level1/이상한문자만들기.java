package Programmers.Level1;

public class 이상한문자만들기 {
  public static void main(String[] args) {
    String s = "   A   a    AaAaAaAaA     aAaAaAa     ";
    StringBuilder answer = new StringBuilder();
    s = s.toLowerCase();

    String[] str = s.split(" ", -1);
    for (int i = 0; i < str.length; i++) {
//      if (str[i] != " ") {
        String a = "";
        for (int j = 0; j < str[i].length(); j++) {
          String c = String.valueOf(str[i].charAt(j));
          if (j % 2 == 0) a += c.toUpperCase();
          else a += c;
        }
        answer.append(a);
//      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') answer.insert(i, " ");
    }

    System.out.println(answer.toString());
  }
}
