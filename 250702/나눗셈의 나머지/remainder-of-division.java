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
        while(bigNum > 1){
            div[cnt] = bigNum % smallNum;
            bigNum = bigNum / smallNum;
            cnt++;
        }



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
        for(int i = 0; i < smallNum; i++){
            sum += spare[i] * spare[i];
        }
        System.out.print(sum);

    }
}