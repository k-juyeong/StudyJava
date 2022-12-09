package Programmers.Level1;

public class 정수내림차순배치 {
  public static void main(String[] args) {
    long n = 118372;
    long answer = 0;
    String m = String.valueOf(n);
    int N = m.length();
    String[] a = new String[N];

    for (int i=0; i<N; i++) {
      a[i] = String.valueOf(m.charAt(i));
    }

    for (int i=1; i<N; i++) {
      for(int j=i; j>0; j--) {
        if(a[j-1].compareTo(a[j]) < 0)
          exch(a, j-1, j);
        else break;
      }
    }

    answer = Long.valueOf(String.join("", a));
    System.out.println(answer);
  }

  private static void exch(String[] a, int i, int j){
    String t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
}
