import java.util.Scanner;
public class Main {
    public static int n, r, c;
    public static int[][] grid = new int[101][101];
    
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    
    public static void move(int x, int y){
        int[] dx = {-1, 1, 0, 0};  // 상, 하, 좌, 우
        int[] dy = {0, 0, -1, 1};

        System.out.print(grid[x][y] + " ");
        
        // 상하좌우 순서로 현재보다 큰 값 찾기
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(inRange(nx, ny) && grid[nx][ny] > grid[x][y]){
                move(nx, ny);  // 찾으면 바로 이동
                return;  // 이동했으면 종료
            }
        }
        // 이동할 곳이 없으면 자동으로 종료
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        move(r-1, c-1);
    }
}