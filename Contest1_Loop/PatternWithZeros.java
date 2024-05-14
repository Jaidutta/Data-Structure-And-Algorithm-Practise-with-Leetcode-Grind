package Contest1_Loop;

import java.util.Scanner;

public class PatternWithZeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();

    int nst = 1;
    int val = 1;
    while(i <= n) {
      // component 1: star
      int cst = 0;
      while(cst < nst) {
        if(i == 1 || i == 2) {
          System.out.print(val + " ");
        }
        else {
          if(cst == 0 || cst == (nst -1)) {
            System.out.print(val + " ");
          }
          else {
            System.out.print("0 ");
          }

        }

        cst++;
      }
      System.out.println();
      nst++;
      val++;
      i++;
    }

  }
}
