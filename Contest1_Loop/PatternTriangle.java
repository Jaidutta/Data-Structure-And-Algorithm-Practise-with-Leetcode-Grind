package Contest1_Loop;

import java.util.Scanner;

public class PatternTriangle {
  public static void main(String[] args) {
    // https://hack.codingblocks.com/app/contests/5857/189/problem

    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nsp = n - 1;
    int nst = 1;
    int val = 1;
    while(i <= n) {
      // 1st component: spaces
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars
      int cst = 0;
      int newVal = val;
      while(cst < nst) {
        System.out.print(newVal + " ");

        if(cst < nst/2) {
          newVal++;
        }
        else {
          newVal--;
        }
        cst++;
      }

      System.out.println();
      nsp--;
      nst += 2;

      val++;
      i++;
    }
  }
}
