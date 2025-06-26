import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                int score = s.nextInt();
                sum += score;
            }
            if(sum/4 >= 60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.println(cnt);



    }
}