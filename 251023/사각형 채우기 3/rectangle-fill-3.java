import java.util.Scanner;
public class Main {
    public static final int MAX = 1000;
    public static long[] dp = new long[MAX+1];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        dp[1] = 2;
        dp[2] = 7;

        for(int i = 3; i < n+1; i++){
            dp[i] = (dp[i-1]  * 2L + dp[i-2]  * 4L)%1000000007;
        }

        System.out.print(dp[n]);
    }
}