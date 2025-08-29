import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sq = new int[201][201];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for(int j = x1 + 100; j < x2 + 100; j++){
                for(int m = y1 + 100; m < y2 + 100; m++){
                    if(i%2==0){
                        sq[j][m] = 1;
                    }else{
                        sq[j][m] = 2;
                    }
                }
            }
            
        }
        // Please write your code here.

        int cnt = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(sq[i][j]==2){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}