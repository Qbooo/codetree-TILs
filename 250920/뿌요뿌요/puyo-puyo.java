import java.util.Scanner;

public class Main {
    public static int n;
    public static int MAX_NUM = 100;
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static int cnt = 0;

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static int DFS(int x, int y, int num){
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        visited[x][y] = true;
        int size = 1;
        
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(inRange(newX, newY) && !visited[newX][newY]){
                if(grid[x][y] == grid[newX][newY]){
                    size += DFS(newX, newY, num);
                }
            }
             
        }
        return size;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // Please write your code here.
        int maxB = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]){
                    int b = DFS(i, j, grid[i][j]);
                    maxB = Math.max(maxB, b);
                    if(b >= 4){
                        cnt++;
                    }
                    
                }


            }
        }

        System.out.print(cnt+" "+maxB);

    }
}