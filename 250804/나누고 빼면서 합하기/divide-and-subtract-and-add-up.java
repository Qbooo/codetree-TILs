import java.util.Scanner;
public class Main {
    public static int aa(int[] x, int m){
        int sum = 0;
        while(true){
            sum += x[m];
            if(m == 1){
                break;
            }
            if(m % 2 == 0){
                m = m/2;
            }else{
                m = m - 1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(aa(arr, m));
    }
}