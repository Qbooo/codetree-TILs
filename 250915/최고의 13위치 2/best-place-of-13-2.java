import java.util.Scanner;
public class Main {
    public static boolean inRange(int x,int y,int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static boolean inBox1(int i, int j, int a, int b){
        for(int m = 0; m < 3; m++){
            for(int x = 0; x < 3; x++){
                if(j + x == b + m && i == a)return false;
            }
        }
        return true;
    }
    public static int boxCoin(int[][] arr,int x,int y){
        int cnt = 0;
        for(int i = 0; i < 3; i++){
            if(arr[x][y+i] == 1)cnt++;
        }
        return cnt;
    }
    public static boolean boxInRange(int x,int y,int n){
        for(int i = 0; i < 3; i++){
            if(!inRange(x, y+i, n)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int max = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(boxInRange(i, j, n)){
                    int cnt1 = boxCoin(arr, i, j);
                    for(int a = 0; a < n; a++){
                        
                        for(int b = 0; b < n; b++){
                            if(boxInRange(a, b, n) && inBox1(i, j, a, b)){
                                int cnt2 = boxCoin(arr, a, b);
                                max = Math.max(cnt1 + cnt2, max);
                            }
                        }
                    }
                }
            }
        }

        System.out.print(max);
    }
}