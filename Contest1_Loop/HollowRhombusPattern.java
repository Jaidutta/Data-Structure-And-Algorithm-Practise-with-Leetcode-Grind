package Contest1_Loop;

import java.util.Scanner;

public class HollowRhombusPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int i = 1;
    int nst = n; // initializing number of stars
    int nsp = n - 1; // initializing number of spaces

    while (i <= n) {

      // 1st component: work for spaces
      int csp = 0;
      while (csp < nsp) {
        System.out.print(" ");
        csp++;
      }

      //2nd component: work for stars
      int cst = 0;
      while (cst < nst) {
        System.out.print("*");
        cst++;
      }

      if (i > 1 && i <= n - 1) {
        int csp2 = 0;
        while (csp2 < n - 1) {
          System.out.print(" ");
          csp2++;
        }
        System.out.print("*");
      }

      // preparation for next iteration
      if (i >= 1 && i < n - 1) {
        nst = 1; // taking number of stars as 1 for in between rows
      } else {
        nst = n; // taking number of stars as n for last row
      }
      nsp = nsp - 1;
      System.out.println();
      i++;
    }
  }
}
