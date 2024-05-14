package Contest1_Loop;

import java.util.Scanner;

public class PatternNumberLadder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();
    int nst = 1;
    int val = 1;

    while (i <= n) {
      int cst = 0;
      while(cst < nst) {
        System.out.print(val + " ");
        val++;
        cst++;
      }

      System.out.println();
      nst++;

      i++;

    }
  }
}
