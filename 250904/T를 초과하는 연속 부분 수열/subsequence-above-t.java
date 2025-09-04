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
        if(arr[0] > t){
            cnt = 1;
            max = 1;
        }
        for(int i = 1; i < n; i++){
            if(arr[i] > t && arr[i - 1] > t){
                cnt++;
            }else if(arr[i] > t){
                cnt = 1;
            }

            if(max < cnt){
                max = cnt;
            }

            //System.out.println("log====> cnt " + cnt + " max " + max);

        }

        System.out.print(max);
    }
}