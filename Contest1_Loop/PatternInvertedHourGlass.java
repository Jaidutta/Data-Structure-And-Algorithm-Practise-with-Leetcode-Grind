package Contest1_Loop;

import java.util.Scanner;

public class PatternInvertedHourGlass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nst1 = 1;
    int nst2 = 1;
    int nsp = 2 * n - 1;
    while(i <= (2* n + 1)) {
      // 1st component: star
      int val1 = n;
      int cst1 = 0;
      while(cst1 < nst1) {
        System.out.print(val1 + " ");
        val1--;
        cst1++;
      }

      // 2nd component: space
      int csp = 0;
      while(csp < nsp) {

          System.out.print("  ");


        csp++;
      }

      // 2nd component: star
      int cst2 = 0;


      int val2 = n - nst2 + 1;
      if(i == n+ 1) {
        cst2 = 1;
        val2 = 1;
      }
      while(cst2 < nst2) {

        System.out.print(val2+ " ");
        val2++;


        cst2++;
      }

      if(i <= (2* n + 1)/ 2) {
        nst1++;
        nst2++;
        nsp -= 2;
      }
      else {
        nst1--;
        nst2--;
        nsp += 2;
      }

      System.out.println();
      i++;
    }

  }
}
