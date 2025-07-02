import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int bigNum = s.nextInt();
        int smallNum = s.nextInt();
        int[] spare = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] div = new int[9999];
        int cnt = 0;
        int share = 1;
        while(share > 0){
            div[cnt] = bigNum % smallNum;
            bigNum = bigNum / smallNum;
            share = bigNum;
            cnt++;
        }

        //System.out.println(cnt);

        for(int i = 0; i < cnt; i++){
            if(div[i] == 0){
                spare[0]++;
            }else if(div[i] == 1){
                spare[1]++;
            }else if(div[i] == 2){
                spare[2]++;
            }else if(div[i] == 3){
                spare[3]++;
            }else if(div[i] == 4){
                spare[4]++;
            }else if(div[i] == 5){
                spare[5]++;
            }else if(div[i] == 6){
                spare[6]++;
            }else if(div[i] == 7){
                spare[7]++;
            }else if(div[i] == 8){
                spare[8]++;
            }else if(div[i] == 9){
                spare[9]++;
            }
        }
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += spare[i] * spare[i];
        }
        System.out.print(sum);

    }
}