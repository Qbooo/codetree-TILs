import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Please write your code here.

        int[] at = new int[1000001];
        int[] bt = new int[1000001];

        int t = 0;
        int loca = 0;
        for(int i = 0; i < n; i++){
            char l = sc.next().charAt(0);
            int tt = sc.nextInt();

            for(int j = t; j < t + tt; j++){
                if(l == 'R'){
                    at[j] = ++loca;
                }else{
                    at[j] = --loca;
                }
            }
            t = t+tt-1;

        }

        t = 0;
        loca = 0;
        for(int i = 0; i < m; i++){
            char l = sc.next().charAt(0);
            int tt = sc.nextInt();

            for(int j = t; j < t + tt; j++){
                if(l == 'R'){
                    bt[j] = ++loca;
                }else{
                    bt[j] = --loca;
                }
            }
            t = t+tt-1;

        }

        boolean meet = false;


        for(int i = 0; i < 1000001; i++){
            if(at[i] == bt[i]){
                System.out.print(i);
                meet = true;
                break;
            }
        }

        if(meet == false){
            System.out.print("-1");
        }

    }
}