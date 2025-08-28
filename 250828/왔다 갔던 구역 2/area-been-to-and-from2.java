import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ss = new int[2001];
        int m = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'L'){
                for(int j = m - 1; j >= m - x; j--){
                    ss[j]++;
                }
                m = m - x;
            }else{
                for(int j = m; j < m + x; j++){
                    ss[j]++;
                }
                m = m + x;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 2001; i++){
            if(ss[i] > 1){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}