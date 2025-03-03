public class place_tiles {

// Place tiles of 1*m on the floor size of n*m    Given :  n=4 , m=2
    public static int  placeTiles(int n , int m){
            if(n==m){
                return 2;
            }
            if(n<m){
                return 1;
            }

            // Vertical placements of tiles 
            int vertical = placeTiles(n-m ,m );

            // Horizontal placements of tiles 
            int horizontal = placeTiles(n-1, m);

            return vertical + horizontal;


    }
 public static void main(String[] args) {
    int n=4 , m=3;
    System.out.println(placeTiles(n,m));
 }   
}
