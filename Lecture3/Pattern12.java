package Lecture3;


public class Pattern12 {
  public static void main(String[] args) {
    int i = 1; // i --> current line
    int n = 5; // n --> total number of rows
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
        // change is happening here
        // when cst is odd we print !
        if(cst  % 2 != 0) {
          System.out.print("! ");
        }
        else {
          // when cst is even we print *
          System.out.print("* ");
        }

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
