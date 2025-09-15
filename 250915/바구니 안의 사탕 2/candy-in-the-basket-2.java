import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        int[] basket = new int [101];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
            basket[positions[i]] += candies[i];
        }
        // Please write your code here.
        int max = 0;
        for(int i = 0; i <= 100 - 2 * k; i++){
            int cnt = 0;
            for(int j = i; j <= i + 2 * k; j++){
                cnt += basket[j];
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}