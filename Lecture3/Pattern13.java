package Lecture3;

public class Pattern13 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nst = 1;
    while(i <= 2 * n -1) {
      int cst = 0;
      while (cst < nst){
        System.out.print("* ");
        cst++;
      }
      if(i >= n) {
        nst--;
      }
      else  {
        nst++;
      }
      System.out.println();
      i++;
    }
  }
}
