import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int num = 0;

        int[][] a = new int[n][m];

        for(int i = 0; i < m; i++){
            if(i%2 == 0){
                for(int j = 0; j < n; j++){
                    a[j][i] = num;
                    num++;
                }
            }
            else{
                for(int j = n-1; j >= 0; j--){
                    a[j][i] = num;
                    num++;
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