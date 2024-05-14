package Lecture1;

import java.util.Scanner;

public class Simple_Interest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the Principal");
    int p = sc.nextInt();

    System.out.println("Enter the rate");
    int r = sc.nextInt();

    System.out.println("Enter the time");
    int t = sc.nextInt();

    int si = (p*r*t)/100;

    System.out.println(si);
  }

}