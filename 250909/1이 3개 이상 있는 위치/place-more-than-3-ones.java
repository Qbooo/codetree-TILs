import java.util.Scanner;
public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static boolean isRange(int x, int y, int n){
        if(x < n && y < n && x >= 0 && y >= 0){
            return true;
        }
        return false;
    }
    public static int count(int[][] arr, int i, int j, int n){
        int cntOne = 0;
        for(int x = 0; x < 4; x++){
            if(isRange(i+dx[x], j+dy[x], n)){
                if(arr[i+dx[x]][j+dy[x]] == 1){
                    cntOne++;
                }
            }
        }
        if(cntOne >= 3){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cnt += count(arr, i, j, n);
            }
        }
        System.out.print(cnt);
    }
}