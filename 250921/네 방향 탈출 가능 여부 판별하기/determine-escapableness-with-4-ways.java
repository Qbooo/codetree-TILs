import java.util.*;

public class Main {
    static int MAX_NUM = 100;
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
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

    public static boolean BFS() {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Point> q = new LinkedList<>();
        
        // 시작점이 뱀이 있는 곳이면 불가능
        if (grid[0][0] == 0) return false;

        q.add(new Point(0, 0));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Point curr = q.poll();
            int x = curr.x;
            int y = curr.y;

            // 도착점 도달
            if (x == n - 1 && y == m - 1) return true;

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (inRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new Point(nx, ny));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        if (BFS()) System.out.println("1");
        else System.out.println("0");
    }
}
