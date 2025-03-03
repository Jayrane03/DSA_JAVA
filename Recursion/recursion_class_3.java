public class recursion_class_3{
    // find the  number of ways in which  you can invite  n people in the party , single or in pairs 0
    //  For n = 1 : Only one way   , n =2 : Two ways 
    public static int calculateWays(int n){

        if(n<=1){
            return 1;
        }
        // Way one Single
        int single  = calculateWays(n-1);

        //  Way two  in pairs

        int pairs  = (n-1) * calculateWays(n-2);
        return single + pairs;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(calculateWays(n));
    }
}
