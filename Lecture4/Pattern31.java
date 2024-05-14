package Lecture4;

public class Pattern31 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    int nst = 5;
    while(i <= n) {
      int val = 5;
      int cst = 0;
      while(cst < nst) {
        if(cst == n - i) {
          System.out.print("* ");
        }
        else {
          System.out.print(val +" ");
        }
        val--;
        cst++;
      }
      System.out.println();
      i++;
    }
  }
}
