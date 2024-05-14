package Lecture2;

public class Pattern3 {
  public static void main(String[] args) {
    int i = 1; // i denotes which line we are at
    int n = 5; // n total number of rows
    int nst = n; // nst indicates the number of star on the first line
    while(i <= n) {
      int cst = 0;
      while(cst < nst) {
        // this loop prints the number of stars in a row
        System.out.print("* ");
        cst++;
      }

      // Preparation for the next line
      System.out.println();
      nst--;
      i++;
    }
  }
}
