package Contest1_Loop;

import java.util.Scanner;

// https://hack.codingblocks.com/app/contests/5857/41/problem
public class HollowDiamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nst1 = (n +1)/2 ;
    int nsp = -1;
    int nst2 = (n +1) /2;

    while(i <= n) {

      // 1st component: stars
      int cst1 = 0;
      while(cst1 < nst1) {
        System.out.print("* ");
        cst1++;
      }

      // 2nd component: spaces
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 3rd component: stars
      int cst2 = 0;
      if(i == 1 || i == n) {
        cst2++;
      }
      while(cst2 < nst2) {
        System.out.print("* ");
        cst2++;
      }

      System.out.println();
      if(i > n/2) {
        // lower half

        nst1++;
        nst2++;
        nsp -= 2;
      }
      else {
        // upper half
        nst1--;
        nst2--;
        nsp += 2;
      }

      i++;
    }

  }
}
