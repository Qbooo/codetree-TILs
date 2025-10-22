import java.util.Scanner;
public class Main {
    public static final int MAX = 1000;
    public static final int MOD = 1000000007; // 상수로 정의
    public static int[] dp = new int[MAX+1];
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        dp[1] = 2;
        dp[2] = 7;
        for(int i = 3; i <= n; i++){
            // ✅ 모든 연산 후 % MOD
            dp[i] = (int)((dp[i-1] * 2L + dp[i-2] * 4L) % MOD);
        }
        System.out.print(dp[n]);
    }
}