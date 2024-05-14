package Lecture2;

public class Pattern1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 5; // n is the number total number of line
    int i = 1; // i denotes which line it is at or the current line it is at

    while (i <= n) {
      int cst = 0;
      while (cst < n) {
        System.out.print("* ");
        cst++;
      }
      System.out.println();
      i++;
    }
  }
}