package Lecture5;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    for(int i = 1; i < n; i++){

      // To print the entire -- System.out.println(a);
      int c = a + b;
      a = b;
      b = c;
    }
    System.out.println(a);
  }
}
