package Lecture3;

public class Pattern15 {
  public static void main(String[] args) {
    int i = 1; // i --> keep track of the current line
    int n= 5;
    int nst= n; // nst --> number of star on the first line
    int nsp= 0; // nsp --> number of space on the first line
    while(i <= 2 * n -1) {

      // 1st component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: star
      int cst = 0;
      while(cst < nst) {
        System.out.print("* ");
        cst++;
      }

      // Preparation for next line
      if(i >= n) {
        // lower half
        nsp -= 2;
        nst++;
      }
      else {
        // upper half
        nsp += 2;
        nst--;
      }
      System.out.println();
      i++;
    }
  }
}
