import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine(); // 개행문자 제거

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String w = s.nextLine();
            sum += w.length();
            if(w.charAt(0) == 'a'){
                cnt++;
            }
        }

        System.out.println(sum+" "+cnt);

    }
}