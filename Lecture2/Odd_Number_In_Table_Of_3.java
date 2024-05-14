package Lecture2;

public class Odd_Number_In_Table_Of_3 {
  public static void main(String[] args) {
    // From 3 *
    int i = 1;

    while(i <= 10) {
      int number = 3 * i;
      if(number % 2 != 0) {
        System.out.println(number);
      }
      i++;
    }
  }
}
