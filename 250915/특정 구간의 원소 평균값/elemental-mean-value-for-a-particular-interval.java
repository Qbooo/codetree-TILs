import java.util.Scanner;
public class Main {
    public static boolean includeAvg(int[] arr, int i, int j){
        int sum = 0;
        for(int x = i; x <= j; x++){
            sum += arr[x];
        }
        int avg = sum/(j-i + 1);
        if(sum % (j - i + 1) != 0) return false;
        for(int x = i; x <= j; x++){
            if(arr[x] == avg)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(includeAvg(arr, i, j))cnt++;
            }
        }
        System.out.print(cnt);
    }
}