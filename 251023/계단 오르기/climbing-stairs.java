import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n <= 4){
            System.out.print(1);
            return;
        }
        
        int[] dp = new int[n+1];  // int로 충분!
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 1;

        for(int i = 5; i <= n; i++){
            dp[i] = (dp[i-2] + dp[i-3]) % 10007;  // ✅ 매번 % 10007!
        }

        System.out.print(dp[n]);
    }
}