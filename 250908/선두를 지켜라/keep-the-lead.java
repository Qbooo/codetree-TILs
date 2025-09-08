import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int[] at = new int[1000001];
        int[] bt = new int[1000001];

        at[0] = 0;
        bt[0] = 0;

        int timeA = 1;
        int timeB = 1;

        for(int i = 0; i < n; i++){
            int v = A[i][0];
            int t = A[i][1];

            for(int j = timeA; j < timeA + t; j++){
                at[j] = v + at[j - 1];
            }
            timeA = timeA + t;

        }

        for(int i = 0; i < m; i++){
            int v = B[i][0];
            int t = B[i][1];

            for(int j = timeB; j < timeB + t; j++){
                bt[j] = v + bt[j - 1];
            }
            timeB = timeB + t;

        }
        int cnt = 0;
        char cer;
        int g = 0;
        while(true){
            if(at[g] > bt[g]){
                cer = 'a';
                cnt = 0;
                break;
            }else if(at[g] < bt[g]){
                cer = 'b';
                cnt = 0;
                break;
            }
            g++;

            if(g >= Math.max(timeA, timeB)){
                System.out.print(0);
                return;
            }
        }
        for(int i = g + 1; i < Math.max(timeA, timeB); i++){
            if(at[i] > bt[i] && cer == 'b'){
                cnt++;
                cer = 'a';
            }else if(at[i] < bt[i] && cer == 'a'){
                cnt++;
                cer = 'b';
            }
        }

        System.out.print(cnt);
    }
}