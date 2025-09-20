import java.util.*;

public class Main {
    public static int n;
    public static int[][] grid;

    public static boolean[][] visited;
    public static int[] people;
    public static int vCnt = 0;
    public static int pCnt = 0;
    public static boolean inRange(int newX, int newY){
        return 0 <= newX && newX < n && 0 <= newY && newY < n;
    }
    public static void DFS(int x, int y){
        int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
        pCnt++;
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(inRange(newX, newY) && !visited[newX][newY]){
                if(grid[newX][newY] == 1){
                    DFS(newX, newY);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean [n][n];
        people = new int[n*n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
                
        // Please write your code here.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    vCnt++;
                    DFS(i, j);
                    people[vCnt] = pCnt;
                    pCnt = 0;

                }
            }
        }
        
        System.out.println(vCnt);
        Arrays.sort(people);
        for(int i = 0; i < n*n; i++){
            if(people[i] != 0){
                System.out.println(people[i]);
            }
        }



    }
}