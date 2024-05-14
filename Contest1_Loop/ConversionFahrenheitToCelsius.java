package Contest1_Loop;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int steps = sc.nextInt();

    int i = start;
    while(i <= end) {
      int celcius = (i-  32) * 5/9;
      System.out.println(i + "\t" + celcius);
      i += steps;
    }
  }
}
