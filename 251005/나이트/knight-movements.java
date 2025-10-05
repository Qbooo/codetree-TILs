import java.util.*;
class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static int r1, c1, r2, c2, n;
    public static boolean[][] visited = new boolean[101][101]; 
    public static boolean inRange(int x, int y){
        return (1 <= x && x <= n && 1 <= y && y <= n && !visited[x][y]);
    }
    public static int BFS(){
        // 시작점과 도착점이 같은 경우
        if (r1 == r2 && c1 == c2) {
            return 0;
        }
        
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r1, c1));
        visited[r1][c1] = true;
        int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
        int distance = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            distance++;
            
            for (int i = 0; i < size; i++) {
                Point curr = q.poll();
                int x = curr.x;
                int y = curr.y;
                
                for (int dir = 0; dir < 8; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    
                    if (inRange(nx, ny)) {
                        // 도착점에 도달
                        if (nx == r2 && ny == c2) {
                            return distance;
                        }
                        
                        visited[nx][ny] = true;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        System.out.print(BFS());
    }
}