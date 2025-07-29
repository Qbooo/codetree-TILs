import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++){
            int m = s.nextInt();
            sum += m;
        }

        String w = Integer.toString(sum);

        w = w.substring(1,w.length()) + w.charAt(0);

        System.out.print(w);

    }
}