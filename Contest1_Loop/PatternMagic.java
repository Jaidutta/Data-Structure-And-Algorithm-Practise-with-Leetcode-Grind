package Contest1_Loop;

import java.util.Scanner;

public class PatternMagic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nst1 = n;
    int nst2 = n;
    int nsp = -1;
    while(i <= 2* n -1) {
      // 1st component: stars
      int cst1 = 0;
      while(cst1 < nst1)
      {
        System.out.print("*");
        cst1++;
      }

      // 2nd component: space
      int csp = 0;
      while(csp < nsp){
        System.out.print(" ");
        csp++;
      }

      // 2st component: stars
      int cst2 = 0;
      if(i == 1 || i == (2* n -1)) {
        cst2++;
      }
      while(cst2 < nst2)
      {
        System.out.print("*");
        cst2++;
      }

      System.out.println();
      if(i >= n) {
        nst1++;
        nst2++;
        nsp -= 2;
      }
      else {
        nst1--;
        nst2--;
        nsp += 2;
      }
      i++;
    }
  }
}
