import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int[][] sq = new int[201][201];
        for(int i = 0; i < n; i++){
            int x1 = x[i] + 100;
            int y1 = y[i] + 100;

            for(int j = x1; j < x1 + 8; j++){
                for(int m = y1; m < y1 + 8; m++){
                    sq[j][m] = 1;
                }
            }
        }

        int cnt = 0;
        for(int j = 0; j < 201; j++){
                for(int m = 0; m < 201; m++){
                    if(sq[j][m] == 1){
                        cnt++;
                    }
                }
            }

            System.out.print(cnt);
    }
}