package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class PrintReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum = 0;
    while(number > 0) {
      int remainder = number % 10;
      sum = sum * 10 + remainder;

      number = number / 10;
    }

    System.out.println(sum);
  }
}
