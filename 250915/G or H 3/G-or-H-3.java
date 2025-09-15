import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = new char[10001];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[pos] = c;
        }
        // Please write your code here.
        int max = 0;
        for(int i = 1; i <= n - k + 1; i++){
            int point = 0;
            for(int j = i; j <= i + k; j++){
                if(arr[j] == 'G')point++;
                else if(arr[j] == 'H'){
                    point += 2;
                }
            }
            max = Math.max(max, point);
        }

        System.out.print(max);

    }
}