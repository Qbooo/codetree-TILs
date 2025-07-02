import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        int[] cnt = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < n; i++){
            num[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(num[i] == 1){
                cnt[0]++;
            }else if(num[i] == 2){
                cnt[1]++;
            }else if(num[i] == 3){
                cnt[2]++;
            }else if(num[i] == 4){
                cnt[3]++;
            }else if(num[i] == 5){
                cnt[4]++;
            }else if(num[i] == 6){
                cnt[5]++;
            }else if(num[i] == 7){
                cnt[6]++;
            }else if(num[i] == 8){
                cnt[7]++;
            }else if(num[i] == 9){
                cnt[8]++;
            }
        }

        for(int i = 0; i < 9; i++){
            System.out.println(cnt[i]);
        }
    }
}