package Programmers.Level2;

public class 짝지어제거ing {
  public static void main(String[] args) {
    String s = "cdcd";
    int answer = 0;
    boolean flag = true;

    while(flag) {
          for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
              s = remove(s);
              break;
            }
          }

          flag = false;
    }

    if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
      s = "";
      answer = 1;
    }


    System.out.println(s);
    System.out.println(s.length());
    System.out.println(answer);
  }
  public static String remove(String s){
    for (int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
          if (i == 0) s = s.substring(2);
          else s = s.substring(0, i) + s.substring(i + 2);
        }
      }
    return s;
  }
}
