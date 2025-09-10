import java.util.Scanner;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1}; 
    public static boolean isRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static int isComfort(int[][] arr, int r, int c, int n){
        int cnt = 0;
        for(int i = 0; i < 4; i++){
            if(isRange(r+dx[i], c+dy[i], n)){
                if(arr[r+dx[i]][c+dy[i]] == 1){
                    cnt++;
                }
            }
        }
        if(cnt == 3){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[][] answer = new int[n][n];
        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            answer[r-1][c-1] = 1;
            System.out.println(isComfort(answer, r-1, c-1, n));

        }

    }
}