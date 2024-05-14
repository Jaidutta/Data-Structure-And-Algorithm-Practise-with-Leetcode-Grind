package Lecture3;

public class Pattern7 {
  public static void main(String[] args) {
    int i = 1; // i --> line we are at or current line
    int n = 9; // n = total number of rows
    int nst = n; // nst --> number of stars in the first line
    int nsp = n - 2; //
    while(i <= n) {  // number of row to print

      if(i == 1 || i == n){
        int cst = 0;
        while(cst < nst) {
          System.out.print("* ");
          cst++;
        }
      }
      else {
        System.out.print("* ");
        int csp = 0;
        while(csp < nsp) {
          System.out.print("  ");
          csp++;
        }
        System.out.print("* ");
      }

      // Preparation for the next line1
      System.out.println();
      i++;
    }
  }
}
