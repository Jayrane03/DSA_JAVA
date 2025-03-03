package Strings;
// Find the 1 and last occurance of an element in a string.
public class Recusion_String {
    public static int firstIndex = -1; // making it static  to remain the value constant through the recursion
    public static int lastIndex = -1;
    public static void findOccurance( String str, int idx , char element){
        if(idx == str.length()){
            System.out.println(firstIndex);
            System.out.println(lastIndex);
            return;
        }
            char currentChar = str.charAt(idx);
            if(currentChar == element){
                if(firstIndex == -1){
                    firstIndex = idx;
                }
                else{
                    lastIndex = idx;
                }
            }
            findOccurance(str, idx +1, element);
    }
    public static void main(String[] args) {
        String str = "aaabbccsaf";
        
        findOccurance(str, 0, 'a');
       
    }
}
