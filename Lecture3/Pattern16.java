package Lecture3;

public class Pattern16 {
  public static void main(String[] args) {
    int i = 1; // i --> current line
    int n = 5;
    int nst = n; // nst --> number of star on the first line
    int nsp = n - 1; // nsp --> number of spaces on the first line

    while(i < 2* n - 1) {

      // 1st component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars
      int cst = 0;
      while(cst < nst) {
        System.out.print("* ");
        cst++;
      }

      // Mirror
      if(i >= n){
        // lower half
        nst++; // star
        nsp++;
      }
      else {
        // upper half
        nst--;
        nsp--;
      }

      System.out.println();
      i++; // should be last statement in a mirror
    }
  }
}
