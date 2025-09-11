import java.util.Scanner;

public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int idx = 3;
    public static int nextIdx(int idx){
        if(idx == 3){
            return 0;
        }
        return idx + 1;
    }
    public static boolean isRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int x = (n-1)/2;
        int y = (n-1)/2;

        int[][] answer = new int [n][n];

        answer[x][y] = 1;
        

        for(int i = 2; i <= n*n; i++){
            int nx, ny;
            nx = x + dx[nextIdx(idx)];
            ny = y + dy[nextIdx(idx)];
            if(isRange(nx, ny, n)){
                if(answer[nx][ny] == 0){
                    answer[nx][ny] = i;
                    x = nx;
                    y = ny;
                    idx = nextIdx(idx);
                }else{
                    nx = x + dx[idx];
                    ny = y + dy[idx];
                    if(isRange(nx, ny, n)){
                    answer[nx][ny] = i;
                    x = nx;
                    y = ny;
                    }else{
                        break;
                    }
                }

            }else{
                break;
            }

        }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print(answer[i][j]+" ");
        }
        System.out.println();
    }


    }
}