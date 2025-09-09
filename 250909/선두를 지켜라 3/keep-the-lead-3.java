import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int[] disA = new int [1000001];
        int[] disB = new int [1000001];

        int timeA = 1;
        int timeB = 1;

        for(int i = 0; i < n; i++){
            int v = a[i][0];
            int t = a[i][1];

            for(int j = timeA; j < timeA + t; j++){
                disA[j] = disA[j - 1] + v;
            }
            timeA = timeA + t;
        }

        for(int i = 0; i < m; i++){
            int v = b[i][0];
            int t = b[i][1];

            for(int j = timeB; j < timeB + t; j++){
                disB[j] = disB[j - 1] + v;
            }
            timeB = timeB + t;
        }
        char lead = 's';
        int cnt = 0;
        for(int i = 0; i < timeA; i++){
            if(disA[i] == disB[i]){
                if(lead != 's'){
                    cnt++;
                }
                lead = 's';
            }else if(disA[i] > disB[i]){
                if(lead != 'a'){
                    cnt++;
                }
                lead = 'a';
            }else if(disB[i] > disA[i]){
                if(lead != 'b'){
                    cnt++;
                }
                lead = 'b';
            }
        } 

        System.out.print(cnt);
    }
}