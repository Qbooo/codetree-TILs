import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] cnt = {0, 0, 0, 0, 0, 0};

        for(int i = 0; i < 10; i++){
            int n = s.nextInt();
            if(n == 1){
                cnt[0]++;
            }else if(n == 2){
                cnt[1]++;
            }else if(n == 3){
                cnt[2]++;
            }else if(n == 4){
                cnt[3]++;
            }else if(n == 5){
                cnt[4]++;
            }else if(n == 6){
                cnt[5]++;
            }
        }

        for(int i = 0; i < 6; i++){
            System.out.println(i+1+" - "+cnt[i]);
        }



    }
}