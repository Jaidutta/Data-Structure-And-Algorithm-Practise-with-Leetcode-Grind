package Contest1_Loop;

import java.util.Scanner;

public class FibonacciPattern_Pattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nst = 1;
    int i = 1;
    int firstFibo = 0;
    int secondFibo = 1;
    int n = sc.nextInt();
    while(i <= n) {


      int cst = 0;
      while (cst < nst) {

        System.out.print((firstFibo) + "\t"); // Print the fibo number
        int thirdFibo = firstFibo + secondFibo; // Generate Third Fibo number
        firstFibo = secondFibo;  //Update first Fibo number
        secondFibo = thirdFibo; // Update third Fibo number
        cst++;
      }


      nst++;
      System.out.println();

      i++;
    }

  }
}
