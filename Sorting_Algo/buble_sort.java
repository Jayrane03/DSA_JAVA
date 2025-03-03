package Sorting_Algo;
// Bubble Sort Algo 
public class buble_sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        // Time complexity  = O(n^2);    --- > Big O of n to the power of 2
        // Space complexity = O(1);
        for(int i=0; i<arr.length-1;i++){   //n-1
            for(int j=0; j<arr.length-1-i;j++){  //n-i-1
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      printArray(arr);
    }
}
