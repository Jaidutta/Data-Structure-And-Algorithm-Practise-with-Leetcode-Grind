package Lecture4;


public class Pattern23 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nsp = n - 1;
    int nst = 1;
    int val = 1;
    while(i <= n) {
      //1st component: spaces
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }


      // 2nd component: stars
      int cst = 0;
      while(cst < nst) {
        System.out.print(val + " ");
        cst++;
      }

      // Preparation for the next line
      System.out.println();
      nsp--;
      nst += 2;

      i++;
    }
  }
}
