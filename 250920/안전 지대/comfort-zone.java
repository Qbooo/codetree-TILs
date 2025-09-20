import java.util.*;
public class Main {
    public static int MAX_NUM = 50;
    public static int[][] grid = new int [MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean [MAX_NUM][MAX_NUM];
    public static int n;
    public static int m;
    public static boolean inRange(int newX, int newY){
        return 0 <= newX && newX < n && 0 <= newY && newY < m;

    }
    public static void DFS(int x, int y, int k){
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(inRange(newX, newY) && !visited[newX][newY]){
                if(grid[newX][newY] > k){
                    DFS(newX, newY, k);
                }
            }
        }
    }
    public static void main(String[] args) {
        int maxSafe = 0;
        int safeK = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int maxK = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maxK = Math.max(maxK, grid[i][j]);
            }
        }
        for(int k = 1; k <= maxK; k++){
            visited = new boolean[n][m];
            int cnt = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(grid[i][j] > k && !visited[i][j]){
                        cnt++;
                        DFS(i, j, k);
                    }
                }
            }
            if(cnt > maxSafe){
                maxSafe = cnt;
                safeK = k;
            }
        }

        System.out.print(safeK+" "+maxSafe);

    }
}