import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 10; i++){
            String w = s.next();
            sum += w.length();
        }

        System.out.println(sum);

    }
}