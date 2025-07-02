import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] ten = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] num = new int[9999];
        int cnt = 0;
        int ser = 1;
        while(ser != 0){
            num[cnt] = s.nextInt();
            ser = num[cnt];
            cnt++;
        }
        for(int i = 0; i < cnt; i++){
            if(num[i]/10 == 1){
                ten[0]++;
            }else if(num[i]/10 == 2){
                ten[1]++;
            }else if(num[i]/10 == 3){
                ten[2]++;
            }else if(num[i]/10 == 4){
                ten[3]++;
            }else if(num[i]/10 == 5){
                ten[4]++;
            }else if(num[i]/10 == 6){
                ten[5]++;
            }else if(num[i]/10 == 7){
                ten[6]++;
            }else if(num[i]/10 == 8){
                ten[7]++;
            }else if(num[i]/10 == 9){
                ten[8]++;
            }
        }

        for(int i = 0; i < 9; i++){
            System.out.println(i+1+" - "+ten[i]);
        }


    }
}