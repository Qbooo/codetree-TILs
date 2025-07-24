import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] sqaur = new int[n][m];
        int num = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sqaur[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(sqaur[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}