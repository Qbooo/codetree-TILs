import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int price = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.
        price = k;
        while(price > 0){
            for(int i = n - 1; i >= 0; i--){
                if(coins[i] <= price){
                    cnt++;
                    price = price - coins[i];
                    break;
                }
            }
        }
        System.out.print(cnt);

    }
}