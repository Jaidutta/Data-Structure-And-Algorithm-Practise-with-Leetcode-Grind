package contest2_NumberSystemAndDataTypes;

import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int digit = sc.nextInt();
    int counter = 0;
    while(number > 0) {
      int currentDigit = number % 10;
      if(currentDigit == digit){
        counter++;
      }
      number = number / 10;
    }
    System.out.println(counter);
  }
}
