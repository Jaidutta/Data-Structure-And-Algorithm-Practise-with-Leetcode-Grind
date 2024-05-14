package Contest1_Loop;

import java.util.Scanner;

public class R4__Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int n = sc.nextInt();

    int nst = 1;

    while(i <= n) {
      //1st component
      int cst = 0;
      while(cst < nst) {
        System.out.print("*");
        cst++;
      }
      System.out.println();
      nst++;

      i++;
    }
  }
}
