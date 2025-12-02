import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        for(int i = 0; i < N; i++){
            int cnt = 0;
            int[] s = new int[1001];
            for(int j = 0; j < i; j++){
                for(int k = A[j]; k < B[j]; k++){
                    s[k]++;
                }
            }
            for(int j = i + 1; j < N; j++){
                for(int k = A[j]; k < B[j]; k++){
                    s[k]++;
                }
            }

            for(int j = 0; j < 1001; j++){
                if(s[j] > 0){
                    cnt++;
                }
            }

            if(max < cnt){
                max = cnt;
            }


        }

        System.out.print(max);
    }
}