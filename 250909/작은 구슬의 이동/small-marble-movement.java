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
        
        int time = 0;
        while(time < T) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            
            // 경계를 벗어나면 방향 전환 (1초 소모)
            if(nx < 1 || nx > N || ny < 1 || ny > N) {
                idx = 3 - idx; // 반대 방향으로 전환
                time++; // 방향 전환에 1초 소모
            } else {
                // 정상 이동 (1초 소모)
                x = nx;
                y = ny;
                time++;
            }
        }
        
        System.out.print(x + " " + y);
    }
}