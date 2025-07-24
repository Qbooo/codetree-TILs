import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[][] a = new int[n][n];

        int[][] rc = new int[m][2];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                rc[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            a[rc[i][0]-1][rc[i][1]-1] = rc[i][0]*rc[i][1];
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}