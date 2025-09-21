import java.util.*;
class Pair{
    public int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static int n;
    public static int k;
    public static int MAX_NUM = 100;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visitied = new boolean[MAX_NUM][MAX_NUM];
    public static Queue<Pair> q = new LinkedList<>();
    public static int cnt = 0;
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static boolean canGo(int x, int y){
        return inRange(x, y) && !visitied[x][y] && grid[x][y] == 0;
    }
    public static void BFS(){
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int x = curr.x; 
            int y = curr.y;
            cnt++;

            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};

            for(int i = 0; i < 4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)){
                    visitied[newX][newY] = true;
                    q.add(new Pair(newX, newY));
                }
            }




        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
    
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt() - 1;
            starts[i][1] = sc.nextInt() - 1;
            
            if(!visitied[starts[i][0]][starts[i][1]] ){
                q.add(new Pair(starts[i][0], starts[i][1]));
                visitied[starts[i][0]][starts[i][1]] = true;
                
            }
            
        }
        BFS();
        System.out.print(cnt);
        // Please write your code here.



    }
}