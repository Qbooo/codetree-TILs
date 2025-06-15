import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        double avg = 0;
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            n = s.nextInt();
            if(n >= 250){
                break;
            }
            sum = sum + n;
            cnt++;
        }
        if(cnt == 0){
            System.out.print("0 -nan");
        }else{
             System.out.print(sum+" "+(double)sum/cnt);
        }
    }
}