import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int cnt = 0;
        double sum = 0;
        
        while(cnt < 10){
            int n = s.nextInt();
            if(n == 0){
                break;
            }
            sum += n;
            cnt++;
        }
        
        System.out.printf("%d %.1f", (int)sum, sum / cnt);


    }
}