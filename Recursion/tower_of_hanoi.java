public class tower_of_hanoi {

    public static void towerOfHanoi(int n , String src , String helper , String destination){
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+destination);
        return;
     }
     towerOfHanoi(n-1, src, destination, helper);
     System.out.println("Move disk "+n+" from "+src+" to "+destination);
     towerOfHanoi(n-1,helper ,src ,destination);
    }


    public static void main(String[] args) {
        int n= 5;
        towerOfHanoi(n, "S", "H", "D");

    }
}
