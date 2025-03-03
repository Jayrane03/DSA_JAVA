package Sorting_Algo;

public class heap_sort_2 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        heap_sort_2 hs = new heap_sort_2();
        hs.printArray(arr);
        hs.heapSort(arr);
        hs.printArray(arr);
    }   
     public void heapSort(int arr[]){
            int  len = arr.length;
            for(int i = len/2-1;i>=0;i++){
                heapiFy(arr , len , i);
            }
            for(int i = len -1;i>=0;i--)
            {
                int temp  = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapiFy(arr, i, 0);
            }
     }
     public void heapiFy(int arr[] , int n,int i)
     {
        int largest = i; //parent node index position
        int left  = 2*i +1; //left child node index
        int right  = 2 * i +2; // right child node index

        if(left < n &&arr[left] > arr[largest])
        {
            largest = left;
        }
        if(right < n && arr[right]> arr[largest]){
            largest = right;
        }
        if(largest != i){
            // Swap 
            int temp = arr[left];
            arr[left]= arr[largest];
            arr[largest] = temp;
            heapiFy(arr, n, largest);
        }

     }
     void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
}
