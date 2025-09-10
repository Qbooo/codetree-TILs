import java.util.Scanner;
public class Main {
    public static char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
    static int x = 0, y = 0;
    static int idx = 0;
    public static boolean isRange(int x, int y, int n, int m){
    return (0 <= x && x < n && 0 <= y && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        char[][] answer = new char [n][m];
        answer[0][0] = 'A';
        for(int i = 1; i < n * m; i++){
            int nx, ny;
            nx = x + dx[idx];
            ny = y + dy[idx];
            if(isRange(nx, ny, n, m) && answer[nx][ny] == 0){
                answer[nx][ny] = alpha[i%alpha.length];
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
                answer[nx][ny] = alpha[i%alpha.length];
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