import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                for(int k = 0; k < n; k++){
                    sum += arr[k];
                }
                sum = sum - arr[i] - arr[j];
                min = Math.min(min, Math.abs(s - sum));
                sum = 0;
            }
        }
        System.out.print(min);
    }

}