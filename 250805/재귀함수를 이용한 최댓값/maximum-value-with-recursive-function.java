import java.util.Scanner;
public class Main {
    public static int max(int n, int[] a, int max){
        if(n == a.length - 1){
            return max;
        }
        if(max <= a[n]){
            return max(n+1, a, a[n]);
        }
        return max(n+1, a, max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(max(0, arr, arr[0]));
    }
}