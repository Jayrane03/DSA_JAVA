import java.util.*;
public class subset {
    // For eg n = 3   so number will be 1 , 2 ,3 coz its n natural numbers so its using n-1 in every call
        // Time complexity  = O(2^n)  because each element has the choice to come or  not come 
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+ " "); 
        }
        System.out.println();
        
    }
    // Print all the subset of set of first  n natural numbers 
    public static void findSubset(int n, ArrayList<Integer> subset){
        // Base  case 
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add the current number (n) to the subset
        subset.add(n);
        findSubset(n - 1, subset);

        // remove the current number (n) from the subset
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

        public static void main(String[] args) {
            int n =3 ;
            ArrayList<Integer> subset = new ArrayList<>();
            findSubset(n, subset);
            
        }
}
