

public class permuatation_of_string {

    public static void printCombination(String str , String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
    }   

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printCombination(newString , permutation+currChar);
        }
        
            // Time  Complexity of this :  a , b ,c  : Choices are n * (n-1) * (n-2) == O(n!)
    }
    public static void main(String[] args) {
        String str = "abcd";
        printCombination(str , "");

    }
}
