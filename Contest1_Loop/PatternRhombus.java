package Contest1_Loop;

import java.util.Scanner;

public class PatternRhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nsp = n - 1;
    int nst = 1;
    int val = 1;
    while(i <= 2* n - 1) {
      // 1st component: space
      int csp = 0;
      while(csp < nsp) {
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars
      int newVal = val;
      int cst = 0;
      while(cst < nst) {
        System.out.print(newVal + " ");
        if(cst < nst/2) {
          newVal++;
        }
        else {
          newVal--;
        }

        cst++;
      }


      System.out.println();
      if(i <= (2* n - 1)/2) {
        nsp--;
        nst+= 2;
        val++;
      }
      else {
        nsp++;
        nst -= 2;
        val--;
      }



      i++;
    }
  }
}
