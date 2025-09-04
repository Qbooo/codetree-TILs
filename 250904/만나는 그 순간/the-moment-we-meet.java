import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Please write your code here.
        int[] ax = new int[2001];
        int[] bx = new int[2001];

        ax[1000] = 0;
        bx[1000] = 0;
        int cnt = 0;
        int x = 1000;
        for(int i = 0; i < n; i++){
            char a = sc.next().charAt(0);
            int t = sc.nextInt();
        

            if(a == 'R'){
                for(int j = x+1; j <= x + t; j++){
                    ax[j] = ++cnt;
                }
                x = x + t;
            }else if(a == 'L'){
                for(int j = x-1; j >= x - t; j--){
                    ax[j] = ++cnt;
                }
                x = x - t;
            }

        }
        cnt = 0;
        x = 1000;
        for(int i = 0; i < m; i++){
            char b = sc.next().charAt(0);
            int t = sc.nextInt();

            if(b == 'R'){
                for(int j = x+1; j <= x + t; j++){
                    bx[j] = ++cnt;
                }
                x = x + t;
            }else if(b == 'L'){
                for(int j = x-1; j >= x - t; j--){
                    bx[j] = ++cnt;
                }
                x = x - t;
            }

        }
        boolean meet = false;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < 2001; i++){
            //System.out.println("log =====> ax" + i + " " + ax[i] + " /// bx"+i+ " " + bx[i]);
            if(ax[i] == bx[i] && ax[i] > 0){
                meet = true;
                if(min > ax[i]){
                    min = ax[i];
                }
            }
        }
        if(meet == false){
            System.out.print("-1");
        }else{
            System.out.print(min);
        }

    }
}