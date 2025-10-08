import java.util.Scanner;
  
public class Main {
    public static int n, m;
    public static int[][] grid = new int[100][100];
    public static int happy = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        // 각 행 검사
        for(int i = 0; i < n; i++){
            int cnt = 1;
            int maxCnt = 1;
            for(int j = 1; j < n; j++){
                if(grid[i][j] == grid[i][j-1]){
                    cnt++;
                    maxCnt = Math.max(maxCnt, cnt);
                } else {
                    cnt = 1;
                }
            }
            if(maxCnt >= m) happy++;
        }
        
        // 각 열 검사
        for(int j = 0; j < n; j++){
            int cnt = 1;
            int maxCnt = 1;
            for(int i = 1; i < n; i++){
                if(grid[i][j] == grid[i-1][j]){
                    cnt++;
                    maxCnt = Math.max(maxCnt, cnt);
                } else {
                    cnt = 1;
                }
            }
            if(maxCnt >= m) happy++;
        }

        System.out.print(happy);
    }
}