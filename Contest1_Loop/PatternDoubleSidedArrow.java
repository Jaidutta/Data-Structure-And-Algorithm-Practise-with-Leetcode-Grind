package Contest1_Loop;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int nsp1 = n - 1;
    int nsp2 = -1;
    int nst1 = 1;
    int nst2 = 1;

    while(i <= n) {
      // 1st component: spaces
      int csp1 = 0;
      while(csp1 < nsp1) {
        System.out.print("  ");
        csp1++;
      }

      // 2nd component: spaces
      int cst1 = 0;
      int val1 = nst1;
      while(cst1 < nst1) {
        //System.out.print("*");
        System.out.print(val1 + " ");
        val1--;
        cst1++;
      }

      // 3rd component: spaces
      int csp2 = 0;
      while(csp2 < nsp2) {
        System.out.print("  ");
        csp2++;
      }

      // 4 component: stars
      int cst2 = 0;
      if(i == 1 || i == n) {
        cst2++;
      }
      int val2 = 1;
      while(cst2 < nst2) {
        //System.out.print("*");
        System.out.print(val2 + " ");
        val2++;
        cst2++;
      }
      System.out.println();
      if(i < (n+1)/2) {
        nsp1-=2;
        nsp2 += 2;
        nst1++;
        nst2++;
      }
      else {
        nsp1 +=2;
        nsp2 -= 2;
        nst1--;
        nst2--;
      }

      i++;
    }
  }
}
