package Lecture9;

public class LinearSearch {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int arr[] = { 1,2,3,-1,-12,17};
    int k = 20;
    boolean isPresent = false;
    for(int i =0;i<arr.length;i++) {
      if(arr[i] == k) {
        isPresent = true;
        break;
      }
    }
    if(isPresent) {
      System.out.println("Present");
    }
    else {
      System.out.println("Not Present");
    }
  }

}