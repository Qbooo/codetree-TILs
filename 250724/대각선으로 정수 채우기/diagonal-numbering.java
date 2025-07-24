import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int num = 1;
        int temp = 0;

        int[][] a = new int[n][m];
        for (int sum = 0; sum <= n + m - 2; sum++) {
            for (int i = 0; i < n; i++) {
                int j = sum - i;
                if (j >= 0 && j < m) {
                    a[i][j] = num++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}