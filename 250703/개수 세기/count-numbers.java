import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int cnt = 0;
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = s.nextInt();
            if(num[i] == m){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}