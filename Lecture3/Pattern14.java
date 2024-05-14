package Lecture3;

public class Pattern14 {
  public static void main(String[] args) {
    int i = 1; // i --> current line
    int n = 5;
    int nst = 1; // nst --> number of star on the first line
    int nsp = n - 1; // nsp --> number of spaces on the first line

    while(i <= 2 * n - 1) {

      // spaces loop
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // star loop
      int cst = 0;
      while(cst < nst) {
        System.out.print("* ");
        cst++;
      }

      // Preparation for the next line
      if(i >= n) {
        // lower half
        nsp++;
        nst--;

      }
      else {
        // upper half
        nsp--;
        nst++;
      }

      System.out.println();
      i++;
    }

  }
}
