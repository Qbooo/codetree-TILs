import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int v = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i = 0; i < n - 1; i++){
            Arrays.sort(arr);
            v += arr[0]+arr[1];
            arr[0] = arr[0] + arr[1];
            arr[1] = Integer.MAX_VALUE;
        }

        System.out.print(v);

    }
}