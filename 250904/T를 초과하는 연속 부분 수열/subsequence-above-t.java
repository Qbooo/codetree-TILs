import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        int max = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > t && arr[i - 1] > t){
                if(arr[i] > arr[i - 1]){
                    cnt++;
                }else{
                    cnt = 1;
                }
            }

            if(max < cnt){
                max = cnt;
            }

        }

        System.out.print(max);
    }
}