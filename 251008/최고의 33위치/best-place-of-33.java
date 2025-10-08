import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] grid = new int[20][20];
    public static int max=0;
    public static int coin(int x, int y){
        int cnt = 0;
        for(int i = x; i < x + 3; i++){
            for(int j = y; j < y + 3; j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                max = Math.max(max, coin(i,j));
            }
        }

        System.out.print(max);

    }
}