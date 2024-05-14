package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class PrintSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int counter = 0;
    int n = 1;
    while(counter < number1) {
      if ((3*n + 2) % number2 != 0) {
        System.out.println(3*n + 2);
        counter++;
      }
      n++;
    }
  }
}
