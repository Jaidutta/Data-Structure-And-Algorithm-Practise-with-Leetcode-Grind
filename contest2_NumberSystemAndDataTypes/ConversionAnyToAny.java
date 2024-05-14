package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class ConversionAnyToAny {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sourceBase = sc.nextInt();
    int destinationBase = sc.nextInt();
    int sourceBaseNumber = sc.nextInt();

    int newNumber =  sourceBaseToDecimal(sourceBaseNumber, sourceBase);
    System.out.println(DecimalToDestinationBase(newNumber, destinationBase));
  }

  private static int sourceBaseToDecimal(int number, int soureBaseNumber) {

    int sum = 0;
    int mul = 1;
    while(number > 0) {
      int rem = number % 10;
      sum = rem * mul + sum;
      mul = mul * soureBaseNumber;
      number = number / 10;
    }
    return sum;
  }
  private static int DecimalToDestinationBase(int number, int destinationBase) {


    int sum = 0;
    int mul = 1;
    while(number > 0) {
      int rem  = number % destinationBase;
      sum  = rem * mul + sum;
      mul = mul * 10;
      number = number/destinationBase;
    }

    return sum;
  }
}
