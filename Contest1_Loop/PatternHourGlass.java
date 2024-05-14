package Contest1_Loop;

import java.util.Scanner;

public class PatternHourGlass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int nsp = 0;
    int nst = 2* n + 1;
    int val = n;

    while(i <= 2*n + 1){
      // 1st component: space
      int csp = 0;
      while(csp < nsp){
        System.out.print("  ");
        csp++;
      }

      // 2nd component: stars

      int cst = 0;
      int newVal = val;
      while(cst < nst) {
        System.out.print(newVal +" ");
        if(cst < nst/2) {
          newVal--;
        }
        else {
          newVal++;
        }

        cst++;

      }


      System.out.println();
      if(i <= n) {
       nst -= 2;
       nsp += 1;
        val--;
      }
      else{
        nst += 2;
        nsp -= 1;
        val++;
      }


      i++;
    }
  }
}
