package Lecture7;

import java.util.Scanner;

public class InverseOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(inverseANumber(n));

  }

  private static int inverseANumber(int number) {


    int sum = 0;
    int place = 1;
    while(number > 0) {
      int remainder = number % 10;
      sum = sum + (int) (place * Math.pow(10, remainder -1));
      place++;
      number = number / 10;
    }
    return sum;
  }
}
