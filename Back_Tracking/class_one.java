package Back_Tracking;


//  Back Tracking applied on the printing  permutation of the given string .   
// Time complexitiy  = O(n*n!) : Total number possible combination is n! but the way to go through it is n
public class class_one {
    public static void printPermutation(String str , String perm , int index){
        if(str.length() == 0){
            System.out.println(perm);
            return;
            
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, perm + currentChar, index+1);
            
        }


    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }

}
