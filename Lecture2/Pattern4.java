package Lecture2;

public class Pattern4 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nst = 1;
    int nsp = n - 1;
    while(i <= n) {

      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      int cst = 0;
      while (cst < nst) {
        System.out.print("* ");
        cst++;
      }

      System.out.println();
      i++;
      nsp--;
      nst++;
    }
  }
}
