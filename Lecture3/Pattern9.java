package Lecture3;

public class Pattern9 {
  public static void main(String[] args) {
    int i = 1; // i --> current line
    int n = 9; // n --> total number of rows
    int nst = 1; // nst --> total number of stars
    int nsp = n - 1; // nsp --> total number of spaces

    while(i < n) {

      // space component
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // star component
      int cst = 0;
      while(cst < nst) {
        System.out.print("* ");
        cst++;
      }

      // Preparation for next line
      System.out.println();
      i++;
      nst += 2;
      nsp--;

    }
  }
}
