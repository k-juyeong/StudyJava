package Programmers.Level1;

public class 문자열내p와y의개수 {
  public static void main(String[] args) {
    String s = "pPoooyY";
    boolean answer = true;
    int cntP = 0;
    int cntY = 0;


    for(int i=0; i<s.length(); i++) {
      String c = String.valueOf(s.charAt(i));
      String upperC = c.toUpperCase();
      if(upperC.equals("P")) {
        cntP++;
      } else if(upperC.equals("Y")) {
        cntY++;
      }

    }

    if(cntP == cntY) {
      answer = true;
    } else if(cntP != cntY) {
      answer = false;
    }

    System.out.println(answer);
  }
}
