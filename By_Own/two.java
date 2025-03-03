package By_Own;


public class two {
    public static int fact;
    public static void calFactorial(int n){
        if(n==0 || n==1){
            return;
        }
      
        // int fact  = calFactorial(n-1);
        // int factorial = fact *n;
        // return factorial;
        for(int i=1;i<n;i++){
             fact =n* n-1;
            
        }
        System.out.println(fact);
    }
    // factorial in recursion
    public static void main(String[] args) {
        int n =5;
        // calFactorial(n);
        // System.out.println);
    }
}
