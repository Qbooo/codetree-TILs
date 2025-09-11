import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int idx = 0;
    public static int changeDirec(char a, int idx){
        if(a == 'R'){
            if(idx == 3){
                return 0;
            }else{
                return idx + 1;
            }
        }else if(a == 'L'){
            if(idx == 0){
                return 3;
            }else{
                return idx - 1;
            }
        }
        return -1;
    }
    public static boolean isRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int x = (n-1)/2;
        int y = (n-1)/2;
        int cnt = board[x][y];

        for(int i = 0; i < t; i++){
            if(commands.charAt(i) == 'F'){
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if(isRange(nx, ny, n)){
                    //System.out.print("====>"+board[nx][ny]);
                    cnt += board[nx][ny];
                    x = nx;
                    y = ny;
                }
            }else{
                idx = changeDirec(commands.charAt(i), idx);
            }
            
        }

        System.out.print(cnt);

    }
}