package Programmers.Level1;

public class 시저암호 {
  public static void main(String[] args) {
    String s = "z";
    int n = 1;
    String answer = "";

    String[] str = s.split("");
    for (String a : str) {
      if (a.equals(" ")) answer += " ";
      else {
        byte[] bytes = a.getBytes();
        if (bytes[0] >= 97 && bytes[0] <= 122) {
          if (bytes[0] + n > 122) bytes[0] = (byte) (bytes[0] + n - 26);
          else bytes[0] = (byte) (bytes[0] + n);
        } else {
          if (bytes[0] + n > 90) bytes[0] = (byte) (bytes[0] + n - 26);
          else bytes[0] = (byte) (bytes[0] + n);
        }
        String p = new String(bytes);
        answer += p;
      }
    }
    System.out.println(answer);
  }
}
