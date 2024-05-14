package Lecture4;

import java.util.Scanner;

public class PrimeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    boolean isPrime = true;

    for(int i = 2; i < number; i++) {
      if(number % i == 0) {
        isPrime = false;
      }
    }

    if(isPrime) {
      System.out.println(number + " is a Prime number");
    }
    else {
      System.out.println(number + " is NOT a Prime number");
    }
  }
}
