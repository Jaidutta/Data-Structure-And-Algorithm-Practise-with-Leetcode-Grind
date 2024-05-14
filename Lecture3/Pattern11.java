package Lecture3;

public class Pattern11 {
  public static void main(String[] args) {
    int i = 1;
    int n = 7;
    int nsp = n - 1;
    int nst = 1;
    while(i <= n) {

      // 1st component: spaces
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars
      int cst = 0;
      while(cst < nst) {
        if(cst % 2 == 0) {
          System.out.print("* ");
        }
        else {
          System.out.print("  ");
        }
        cst++;
      }

      System.out.println();
      nsp--;
      nst += 2;
      i++;
    }
  }
}
