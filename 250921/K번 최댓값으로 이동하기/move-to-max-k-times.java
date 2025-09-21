import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n, k;
    static int[][] grid;
    static int currentX, currentY;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        currentX = sc.nextInt() - 1; // 1-based to 0-based
        currentY = sc.nextInt() - 1;
        
        // K번 이동
        for (int move = 0; move < k; move++) {
            bfs();
        }
        
        System.out.println((currentX + 1) + " " + (currentY + 1));
    }
    
    public static void bfs() {
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        
        q.add(new Pair(currentX, currentY));
        visited[currentX][currentY] = true;
        
        int maxValue = Integer.MIN_VALUE;
        Pair bestPosition = new Pair(currentX, currentY);
        
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            
            // 현재보다 작은 값 중에서 가장 큰 값 찾기
            if (grid[x][y] < grid[currentX][currentY] && grid[x][y] > maxValue) {
                maxValue = grid[x][y];
                bestPosition.x = x;
                bestPosition.y = y;
            } 
            // 같은 값이면 행이 작은 것, 그것도 같으면 열이 작은 것 우선
            else if (grid[x][y] == maxValue && grid[x][y] < grid[currentX][currentY]) {
                if (x < bestPosition.x || (x == bestPosition.x && y < bestPosition.y)) {
                    bestPosition.x = x;
                    bestPosition.y = y;
                }
            }
            
            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (inRange(nx, ny) && !visited[nx][ny] && canGo(nx, ny)) {
                    visited[nx][ny] = true;
                    q.add(new Pair(nx, ny));
                }
            }
        }
        
        // 이동할 수 있는 곳이 있다면 이동
        if (maxValue != Integer.MIN_VALUE) {
            currentX = bestPosition.x;
            currentY = bestPosition.y;
        }
    }
    
    public static boolean canGo(int x, int y) {
        return grid[x][y] < grid[currentX][currentY];
    }
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}