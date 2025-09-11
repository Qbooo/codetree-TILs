import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int a = arr[i];
            for(int j = i + 1; j < n; j++){
                int b = arr[j];
                if(a <= b){
                    for(int m = j + 1; m < n; m++){
                        int c = arr[m];
                        if(b <= c){
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}