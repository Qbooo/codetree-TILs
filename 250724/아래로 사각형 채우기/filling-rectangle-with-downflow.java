import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];

        int num = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[j][i] = num;
                num++;
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