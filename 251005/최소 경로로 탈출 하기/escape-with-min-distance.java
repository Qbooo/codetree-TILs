import java.util.*;

public class Main {
    static int MAX_NUM = 100;
    static int[][] grid = new int[MAX_NUM][MAX_NUM];
    static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    static int n, m;
    
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
    
    public static boolean canGo(int x, int y) {
        return inRange(x, y) && !visited[x][y] && grid[x][y] == 1;
    }
    
    public static int BFS() {
        // 상하좌우 4방향
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0));
        visited[0][0] = true;
        
        int distance = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            
            // 같은 거리에 있는 모든 점들을 처리
            for (int i = 0; i < size; i++) {
                Point curr = q.poll();
                int x = curr.x;
                int y = curr.y;
                
                // 도착점에 도달
                if (x == n - 1 && y == m - 1) {
                    return distance;
                }
                
                // 4방향 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    
                    if (canGo(nx, ny)) {
                        visited[nx][ny] = true;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            
            distance++;
        }
        
        // 도착할 수 없는 경우
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        // 시작점이나 끝점이 뱀이 있는 곳이면 불가능
        if (grid[0][0] == 0 || grid[n-1][m-1] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(BFS());
        }
    }
}