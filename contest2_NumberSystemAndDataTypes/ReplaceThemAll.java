package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class ReplaceThemAll {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.print(replaceAllZeroes(number));
  }
  private static int replaceAllZeroes(int number)
  {
    if (number == 0) {
      return 5;
    }
    int sum = 0;
    int place = 0;
    int multiplier = 1;
    while(number > 0) {

      int remainder = number % 10;
      if (remainder == 0) {
        remainder = 5;
      }

      sum = sum + remainder * multiplier;
      multiplier *= 10;
      number = number / 10;
      place++;
    }
    return sum;
  }


}

