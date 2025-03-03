import java.util.HashSet;
import java.util.Set;

public class subsequence_String {
    // Print the subsequence in the String;  ---> All the char had the choice to come in the newString or not;   in a sequence only folow the order
/*
Very Important to Placement pont of view

Time Complexity : - O()
abc
ab
bc
ac                  ----   For unique subseq use HashSet   For eg "aaa"
a
b
c
_
*/   
    public static void printSubsequence(String str , int idx , String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;

            }

        }
        char currChar  = str.charAt(idx);

        //  currChar to be in the String
        printSubsequence(str, idx+1, newString +currChar ,set);
        //  currChar to not ot be in the String 

        printSubsequence(str, idx+1, newString ,set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubsequence(str, 0, "" ,set);
    }
}
