import java.util.Scanner;
public class Main {
    static int x = 0, y = 0;
    static int[]dx = {1,  0, -1, 0}, dy = {0, 1, 0, -1};
    static int idx = 0;
    public static boolean isRange(int x, int y, int n, int m){
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[][] answer = new int [n][m];
        answer[0][0] = 1;
        for(int i = 2; i <= n * m; i++){
            int nx, ny;
            nx = x + dx[idx];
            ny = y + dy[idx];
            if(isRange(nx, ny, n, m) && answer[nx][ny] == 0){
                answer[nx][ny] = i;
                x = nx;
                y = ny;
            }else{
                if(idx == 3){
                    idx = 0;
                }else{
                    idx = idx + 1;
                }
                nx = x + dx[idx];
                ny = y + dy[idx];
                answer[nx][ny] = i;
                x = nx;
                y = ny;
            }
        }

        for(int i = 0; i < n; i++){
            for( int j = 0; j < m; j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

    }
}