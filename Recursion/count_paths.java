public class count_paths {

    public static int countPaths(int i, int j, int m, int n) {
        if (i >= n || j >= m) {
            return 0;
        }
        
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        
        // move downwards
        int downWard = countPaths(i + 1, j, m, n);
        
        // move rightwards
        int rightwards = countPaths(i, j + 1, m, n);
        
        return downWard + rightwards;
    }

    public static void main(String[] args) {
        // Count total paths in a maze to move from (0,0) to (n-1,m-1)
        int n = 4, m = 4;
        int totalPaths = countPaths(0, 0, m, n);
        System.out.println(totalPaths); // Should print 6 for a 3x3 grid
    }
}
