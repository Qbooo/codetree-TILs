import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        for(int i = 0; i < n; i++){
            a[0][i] = 1;
            a[i][0] = 1;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                a[i][j] = a[i-1][j] + a[i-1][j-1] + a[i][j-1];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}