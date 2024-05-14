package Contest1_Loop;

import java.util.Scanner;

public class PatternMountain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int nst1 = 1;
    int nst2 = 1;
    int nsp = 2 * n - 3;
    while(i <= n) {

      // 1st component: stars
      int cst1 = 1;
      while(cst1 <= nst1) {

        //System.out.print("* ");
        System.out.print(cst1 +" ");
        cst1++;
      }

      // 2nd component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print( "  ");
        csp++;
      }

      // 3rd component: stars
      int cst2 = 1;
      int val2 = nst2;
      if(i == n) {
        cst2++;
      }
      if(i == n) {
        val2 = nst2 - 1;
      }
      while(cst2 <= nst2) {
        //System.out.print("* ");
        System.out.print(val2 +" ");
        val2--;
        cst2++;
      }
      System.out.println();
      nst1++;
      nst2++;
      nsp -= 2;
      i++;
    }
  }
}
