import java.util.Scanner;
public class Main {
    static int[] dx = {1, -1, 0, 0, -1, 1, -1, 1};
    static int[] dy = {0, 0, 1, -1, 1, -1, -1, 1};
    static int idx = 0;
    
    public static boolean isRange(int x, int y, int n, int m){
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static boolean isLEE(int x, int y, int n, int m, int idx, char[][] arr2){
        int cnt = 0;
        for(int k = 1; k <= 2; k++){
            int nx = x + dx[idx] * k;
            int ny = y + dy[idx] * k;
            if(!isRange(nx, ny, n, m)) return false;
            if(arr2[nx][ny] == 'E') cnt++;
            else return false;
        }

        if(cnt != 2) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.

        char[][] arr2 = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = arr[i].charAt(j);
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                if(arr2[i][j] == 'L'){
                    for(idx = 0; idx < 8; idx++){
                        if(isLEE(i, j, n, m, idx, arr2)){
                            cnt++;
                        }
                    }
                }


            }
        }

        System.out.print(cnt);

    }
}