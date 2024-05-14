package Lecture2;

public class Pattern2 {
  public static void main(String[] args) {
    int i = 1;  // // i denotes which line it is at or the current line it is at
    int n = 7;  // n is the number total number of line
    int nst = 1; // nst denotes the number of stars in the first line
    while(i <= n) {
      int cst = 0;
      while(cst < nst) {
        // this loop prints the number of stars in the row
        System.out.print("* ");
        cst++;
      }

      // Preparation for the next line
      System.out.println();
      i++;
      nst++;
    }
  }
}
