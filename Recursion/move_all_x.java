public class move_all_x {
//    Move all x to the end of the string and print the updated String.
    public static void moveAllX(String str , int count , int idx , String newString){
        
        if(idx == str.length()){
            for(int i=0; i<count;i++){
                newString += "x";  //add all the x at the end of the new string 
            }

        System.out.println(newString);
        return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == 'x'){
            count ++;
            moveAllX(str, count, idx +1, newString);
        }
        else{
            newString += currentChar;
            moveAllX(str, count, idx+1, newString);
        }

    }
    public static void main(String[] args) {
        String str = "axbxxcc";
        moveAllX(str, 0, 0, "");
    }
}
