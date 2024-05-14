package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int place = 1;
    int oddPlacedDigitsSum = 0;
    int evenPlacedDigitsSum = 0;
    while(n > 0) {
      if(place % 2 == 0) {
        evenPlacedDigitsSum = evenPlacedDigitsSum + n % 10;
      }
      else {
        oddPlacedDigitsSum = oddPlacedDigitsSum + n % 10;
      }

      n = n / 10;

      place++;
    }
    System.out.println(oddPlacedDigitsSum);
    System.out.println(evenPlacedDigitsSum);
  }
}
