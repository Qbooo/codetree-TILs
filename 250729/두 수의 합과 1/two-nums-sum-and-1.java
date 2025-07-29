import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int n = a + b;
        int cnt = 0;

        String w = Integer.toString(n);

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) == '1'){
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}