package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class SimpleInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    while(sum >= 0) {
      int number = sc.nextInt();

      sum += number;
      if(sum > 0)
      System.out.println(number);
    }
  }
}
