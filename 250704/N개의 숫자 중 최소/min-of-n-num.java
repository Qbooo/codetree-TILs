import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        num[0] = s.nextInt();
        int min = num[0];
        for(int i = 1; i < n; i++){
            num[i] = s.nextInt();
            if(min > num[i]){
                min = num[i];
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(min == num[i]){
                cnt++;
            }
        }

        System.out.println(min+" "+cnt);

    }
}