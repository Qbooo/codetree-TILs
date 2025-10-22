import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[n+1];
        if(n <= 4){
            System.out.print(1);

        }else{
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 1;

            for(int i = 5; i < n+1; i++){
                dp[i] = dp[i-2] + dp[i-3];
            }

            System.out.print(dp[n]);
        }
        
    }

}