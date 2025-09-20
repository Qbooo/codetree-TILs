import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        int[][] visited = new int [n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        DFS(0, 0, visited, grid, n, m);
        if(visited[n-1][m-1] == 1){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
    public static void DFS(int x, int y, int[][] visited, int[][] grid, int n, int m){
        int[] dx = {1, 0};
        int[] dy = {0, 1};

        visited[x][y] = 1;

        for(int i = 0; i < 2; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(inRange(newX, newY, n, m)){
                if(canGo(newX, newY, grid)){
                    DFS(newX, newY, visited, grid, n, m);
                }
            }
            
        }


    }
    public static boolean inRange(int newX, int newY, int n, int m){
        return 0 <= newX && newX < n && 0 <= newY && newY < m;
    }
    public static boolean canGo(int newX, int newY, int[][] grid){
        return grid[newX][newY] == 1;
    }
    
}