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
                if (cnt > b) {      // 예산을 넘으면 j번째는 못 삼
                    if (max < j) {
                        max = j;    // j명까지만 가능한 것
                    }
                    break;
                }

                if (cnt == b) {     // 딱 맞으면 j+1명 가능
                    if (max < j+1) {
                        max = j+1;
                    }
                    break;
                }

            }
        }

        System.out.print(max);
    }
}