import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[][] a = new int[n][n];
        int cnt = 0;
        int num = 1;

        for(int i = n - 1; 0 <= i; i--){
            if(cnt % 2 == 0){
                for(int j = n - 1; j >= 0; j--){
                    a[j][i] = num++;
                }
            }
            else{
                for(int j = 0; j < n; j++){
                    a[j][i] = num++;
                }
            }
            cnt++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}