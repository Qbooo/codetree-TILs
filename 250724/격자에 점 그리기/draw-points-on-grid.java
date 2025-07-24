import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[][] rc = new int[m][2];
        int[][] a = new int[n][n];
        int num = 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                rc[i][j] = s.nextInt();
            }
            a[rc[i][0]-1][rc[i][1]-1] = num++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}