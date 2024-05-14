package Lecture8;

import java.util.Scanner;

public class ArraysDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//		int arr[] = {1,2,3,4,5}; //  initializing an array  specific elements
    Scanner sc=  new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n]; // say for example of 4 elements

//    arr[0] = sc.nextInt();
//    arr[1] = sc.nextInt();
//    arr[2] = sc.nextInt();
//    arr[3] = sc.nextInt();
//    arr[4] = sc.nextInt();

    for(int i =0;i< arr.length ;i++) {
      arr[i]= sc.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }



  }
}