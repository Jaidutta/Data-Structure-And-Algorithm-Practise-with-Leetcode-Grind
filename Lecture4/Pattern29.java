package Lecture4;

public class Pattern29 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nst = 1;
    int nsp = n - 1;
    int val = 1;
    while(i <= n) {
      // 1st component: spaces
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars
      int cst = 0;
      while(cst < nst) {
        if(cst == 0 || cst == (nst -1)) {
          System.out.print(val + " ");
        }
        else {
          System.out.print("0 ");
        }

        cst++;
      }

      // preparation of next line
      System.out.println();
      nsp--;
      nst += 2;
      val++;
      i++;
    }
  }
}
