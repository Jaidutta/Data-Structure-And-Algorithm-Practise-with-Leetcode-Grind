package Lecture3;

public class Pattern20 {
  public static void main(String[] args) {
    int i = 1; // i --> represent the current line
    int n = 7;
    int nsp1 = n/2;  // nsp1 --> total number of spaces on line 1
    int nsp2 = -1;   // nsp2 --> total number of space on line 1
    int nst1 = 1;   // nst1 --> total number of stars on line 1
    int nst2 = 1;   // nst2 --> total number of stars on line 1
    while(i <= n) {
      // component 1: space
      int csp = 0;
      while(csp < nsp1) {
        System.out.print("  ");
        csp++;
      }

      // component 2: stars
      int cst1 = 0;
      while(cst1 < nst1) {
        System.out.print("* ");
        cst1++;
      }

      // component 3: space
      int csp2 = 0;
      while(csp2 < nsp2) {
        System.out.print("  ");
        csp2++;
      }

      // component 4: star
      int cst2 = 0;
      if(i == 1 || i == n) {
        // to eliminate the extra star on line 1 and final line
        cst2++;
      }
      while(cst2 < nst2) {
        System.out.print("* ");
        cst2++;
      }

      if(i > n/2) {
        // lower half
        nsp1++;
        nsp2 -= 2;
      }
      else {
        // upper half
        nsp1--;
        nsp2 += 2;
      }

      // Preparation for next line
      System.out.println();
      i++;
    }
  }
}
