import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int cnt = 0;
        for(int i = 0; i < m; i++){
            int n = s.nextInt();
            cnt = 0;
            while(n!=1){
                if(n%2==0){
                    n = n/2;
                }
                else{
                    n = 3*n + 1;
                }
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}