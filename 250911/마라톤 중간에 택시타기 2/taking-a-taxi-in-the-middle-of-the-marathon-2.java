import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n - 1; i++){
            int dis = 0;
            for(int j = 0; j < i - 1; j++){
                dis += Math.abs(x[j] - x[j+1]) + Math.abs(y[j] - y[j+1]);
            }
            dis += Math.abs(x[i-1] - x[i+1]) + Math.abs(y[i-1] - y[i+1]);
            for(int j = i + 1; j < n - 1; j++){
                dis += Math.abs(x[j] - x[j+1]) + Math.abs(y[j] - y[j+1]);
            }

            min = Math.min(min, dis);
        }

        System.out.print(min);
    }
}