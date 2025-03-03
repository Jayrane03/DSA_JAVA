package Sorting_Algo;

public class selection_sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Selection Sorting 
        int arr[] = {7,8,3,1,2};
        // Time complexity = O(n^2)
        
        for(int i=0;i<arr.length-1; i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;

                }   
            
            }
            int temp =arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }
}
