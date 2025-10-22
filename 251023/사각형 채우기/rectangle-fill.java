import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        if(n == 1){
            System.out.print(1);
        }else if( n == 2){
            System.out.print(2);
        }else{
            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3; i < n+1; i++){
                dp[i] = (dp[i-1]+dp[i-2])%10007;
            }
            System.out.print(dp[n]);
        }
    }
}