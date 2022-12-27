package Programmers.Level0;

public class 옷가게할인받기 {
  public static void main(String[] args) {
    int price = 150000;
    int answer = price;

    if (price >= 500000) answer = (int) (price * 0.8);
    else if (price >= 300000) answer = (int) (price * 0.9);
    else if (price >= 100000) answer = (int) (price * 0.95);

    System.out.println(answer);
  }
}
