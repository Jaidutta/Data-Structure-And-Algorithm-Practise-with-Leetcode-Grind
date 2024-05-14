package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalNumber = sc.nextInt();

    for (int i = 0; i < totalNumber; i++) {
      int carNumber = sc.nextInt();
      System.out.println(isCarAllowed(carNumber));
    }
  }
  private static String isCarAllowed(int number) {
    int sumOfOddDigits = 0;
    int sumOfEvenDigits = 0;

    while (number > 0)
    {
      int digit = number % 10;
      if (digit % 2 == 0)
      {
        sumOfEvenDigits += digit;
      } else
      {
        sumOfOddDigits += digit;
      }
      number = number / 10;
    }
    if (sumOfEvenDigits % 4 == 0 || sumOfOddDigits % 3 == 0)
    {
      System.out.println(sumOfEvenDigits);
      System.out.println(sumOfOddDigits);
      return "Yes";
    } else
    {

      return "No";
    }

  }
}
