import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        
        int x = R;
        int y = C;
        int[] dx = {0, 1, -1, 0}; // R, D, U, L
        int[] dy = {1, 0, 0, -1};
        
        int idx = 0;
        if(D.equals("R")) idx = 0;
        else if(D.equals("D")) idx = 1;
        else if(D.equals("U")) idx = 2;
        else if(D.equals("L")) idx = 3;
        
        for(int i = 0; i < T; i++) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            
            // 경계를 벗어나면 방향만 전환 (이동X, 1초 소모)
            if(nx < 1 || nx > N || ny < 1 || ny > N) {
                idx = 3 - idx; // 방향 전환
                // 위치는 그대로, i++는 for문에서 자동으로
            } else {
                // 정상 이동
                x = nx;
                y = ny;
                // i++는 for문에서 자동으로
            }
        }
        
        System.out.print(x + " " + y);
    }
}