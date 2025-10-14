import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[][] grid = new int[21][21];
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void swap(int a){
        int x = 0, y = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == a){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int max = 0;
        int idx = -1;
        int idy = -1;
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(inRange(nx, ny)){
                if(max < grid[nx][ny]){
                    max = grid[nx][ny];
                    idx = nx;
                    idy = ny;
                }
            }

        }
        grid[x][y] = max;
        grid[idx][idy] = a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        for(int i = 0; i < m; i++){
            for(int j = 1; j <= n * n; j++){
                swap(j);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}