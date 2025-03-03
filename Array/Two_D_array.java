package Array;

import java.util.Scanner;

class Two_D_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int x = 2;
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] numbers = new int[rows][cols];
  //  For input 
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();

      }
    }
    // For output
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
      //  System.out.println("The 2D array is:");
      if(numbers[i][j] == x ){
        System.out.println("The number is present in the array");
        System.out.println(numbers[i][j]);
      }
  

      }
 
    }
  }
}
