import java.util.Scanner;
public class Main {
    public static int n, m, k;
    public static int[][] grid = new int[101][101];
    public static void gravity(){
        int min = Integer.MAX_VALUE;
        for(int i = k-1; i < k + m-1; i++){
            for(int j = 0; j < n; j++){
                if(grid[j][i] == 1 && min > j - 1){
                    min = j - 1;
                }else if(j == n-1 && min > j){
                    min = j;
                }
            }
        }
        for(int i = k-1; i < k + m-1; i++){
            grid[min][i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        gravity();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }

    }
}