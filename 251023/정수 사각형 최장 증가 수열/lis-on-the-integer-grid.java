import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static int[][] dp;
    static int[] dx = {-1, 0, 1, 0};  // 상 우 하 좌
    static int[] dy = {0, 1, 0, -1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                dp[i][j] = -1;  // -1: 방문 안함
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer = Math.max(answer, dfs(i, j));
            }
        }
        
        System.out.println(answer);
    }
    
    // DFS + 메모이제이션
    static int dfs(int x, int y) {
        // 이미 계산된 경우
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        
        // 현재 위치에서 시작하는 최대 길이 = 1
        dp[x][y] = 1;
        
        // 4방향 탐색
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            // 유효한 위치이고, 값이 증가하면
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && 
                grid[nx][ny] > grid[x][y]) {
                dp[x][y] = Math.max(dp[x][y], dfs(nx, ny) + 1);
            }
        }
        
        return dp[x][y];
    }
}