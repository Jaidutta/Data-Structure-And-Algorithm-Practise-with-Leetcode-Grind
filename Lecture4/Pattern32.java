package Lecture4;

public class Pattern32 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nst = 1;
    int val = 1;

    while(i <= 2* n -1) {
      // 1st component: stars
      int cst = 0;
      while(cst < nst){
        // if  cst is even or 0 print val else when cst == odd print *
        if(cst % 2 == 0) {
          System.out.print(val + " ");
        }
        else {
          System.out.print("* ");
        }

        cst++;
      }

      // prepare for next line
      System.out.println();

      // val is changing when i is changing not when cst is changing
      if(i < n)  // if i < less than increase nst by 2, increase val by 1 else  decrease nst by 2 and val by 1
      {
        // upper half
        nst += 2;
        val++;
      }
      else {
        // lower half
        nst -= 2;
        val--;
      }


      i++;
    }
  }
}
