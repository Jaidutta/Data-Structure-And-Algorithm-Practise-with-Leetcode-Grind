package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class PrintArmstrongNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();
    while(firstNumber <= secondNumber) {
      if(Is_Armstrong_Number(firstNumber)) {
        System.out.println(firstNumber);
      }
      firstNumber++;
    }
  }

  public static boolean Is_Armstrong_Number(int n)
  {
    int d = Countofdigit(n);
    int sum = 0;
    int p = n;
    while (n > 0)
    {
      int rem = n % 10;
      sum = (int) (sum + Math.pow(rem, d));// TypCasting
      n = n / 10;
    }
    if (sum == p)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public static int Countofdigit(int n) {

    int count = 0;
    while (n > 0) {
      count++;
      n = n / 10;
    }
    return count;
  }
}
