import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] num = new int[100];
        int cnt = 0;
        int ser = 1;
        while(ser != 0){
            num[cnt] = s.nextInt();
            ser = num[cnt];
            cnt++;
            
        }
        

        for(int i = 0; i < cnt - 1; i++){
            if(num[i]%2 == 1){
                System.out.print(num[i]+3+" ");
            }
            else{
                System.out.print(num[i]/2+" ");
            }
        }
    }
}