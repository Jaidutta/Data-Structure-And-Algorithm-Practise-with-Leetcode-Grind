package Lecture4;

public class Pattern21 {
  public static void main(String[] args) {
    int i = 1;  // i is used to keep track of
    int n = 5;
    int nst1 = 1; // nst1 --> number of stars on the first line
    int nst2 = 1; // nst2 --> number of stars on the first line
    int nsp = (2 * n -1) - 2; // nsp --> number of spaces on the first line

    while(i <=n) {
      // component 1: star  nst1
      int cst1 = 0;
      while(cst1 < nst1) {
        System.out.print("* ");
        cst1++;
      }

      // component 2: spaces  nsp
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // component 3: star  nst2
      int cst2 = 0;

      // to eliminate the extra star produced by the 3rd component
      if(i == n) {
        cst2++;
      }
      while(cst2 < nst2) {
        System.out.print("* ");
        cst2++;
      }

      // Preparation for the next line
      nst1++;
      nsp -= 2;
      nst2++;
      System.out.println();
      i++;

    }

  }
}
