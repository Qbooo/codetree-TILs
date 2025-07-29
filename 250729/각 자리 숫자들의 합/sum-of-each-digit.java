import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        String w = Integer.toString(n);
        int sum = 0;

        for(int i = 0; i < w.length(); i++){
            sum += w.charAt(i) - '0';
        }

        System.out.print(sum);
    }
}