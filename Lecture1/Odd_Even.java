package Lecture1;

import java.util.Scanner;

public class Odd_Even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();

    if(number % 2 == 0) {
      System.out.println("The number " + number + "is Even");
    }
    else {
      System.out.println("The number " + number + "is Odd");
    }
  }

}
