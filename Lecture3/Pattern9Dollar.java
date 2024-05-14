package Lecture3;


public class Pattern9Dollar {
  public static void main(String[] args) {
    int i = 1; // i --> current line
    int n = 5; // n --> total number of rows
    int nst = 1; // nst --> total number of stars
    int nsp = n - 1; // nsp --> total number of spaces

    int nod = n -1; // nod --> number of dollars
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

      int cod = 0;
      while(cod < nod) {
        System.out.print("$ ");
        cod++;
      }

      // Preparation for next line
      System.out.println();
      i++;
      nst += 2;
      nsp--;
      nod--;
    }
  }
}
