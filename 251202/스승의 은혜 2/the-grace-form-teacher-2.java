import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(p);
        int max = 0;

        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(j == i){
                    cnt += p[j]/2;
                }else{
                    cnt += p[j];
                }
                if(b <= cnt){
                    if(max < j){
                        max = j;
                    }
                    break;
                }

            }
        }

        System.out.print(max);
    }
}