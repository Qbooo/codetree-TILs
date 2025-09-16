import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n - t + 1; i++){
            int cost = 0;
            for(int j = i; j < i + t; j++){
                cost += Math.abs(h - arr[j]);
            }
            min = Math.min(min, cost);
        }

        System.out.print(min);

    }
}