package Contest1_Loop;

import java.util.Scanner;

public class MirrorStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nst = 1;
    int nsp = n/2;
    while(i <= n) {
      // 1st component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: space
      int cst = 0;
      while(cst < nst) {
        System.out.print("* ");
        cst++;
      }

      System.out.println();

      if(i <= n/2) {
        nst += 2;
        nsp -= 1;
      }
      else {
        nst -= 2;
        nsp += 1;
      }
      i++;
    }
  }
}
