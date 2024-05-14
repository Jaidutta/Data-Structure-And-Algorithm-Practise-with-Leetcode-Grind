package Lecture3;

public class Pattern19 {
  public static void main(String[] args) {
    int i = 1; // i --> keep track of the current line
    int n= 7;
    int nst1= (n +1) / 2; // nst --> number of star on the first line
    int nsp= -1 ; // nsp --> number of space on the first line

    int nst2= (n +1) / 2; // nst --> number of star on the first line

    while(i <= n) {

      // 1st component: star
      int cst1 = 0;
      while(cst1 < nst1) {
        System.out.print("* ");
        cst1++;
      }

      // 2nd component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print("$ ");

        csp++;
      }

      // 3rd component: star
      int cst2 = 0;
      if(i == 1 || i == n) {
        cst2++;
      }
      while(cst2 < nst2) {

        System.out.print("* ");
        cst2++;

      }





      // Preparation for next line
      if(i >= (n+ 1)/2) {
        // lower half
        nst1++;
        nsp -= 2;
        nst2++;

      }
      else {
        // upper half
        nst1--;
        nsp += 2;
        nst2--;
      }
      System.out.println();
      i++;
    }

  }
}
