package Contest1_Loop;

import java.util.Scanner;

public class DoYouKnowTable2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    int i = 1;
    while(i <= y) {
      System.out.println(x * i);
      i++;
    }
  }
}
