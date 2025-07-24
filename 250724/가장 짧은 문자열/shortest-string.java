import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 3; i++){
            String w = s.next();
            if(min > w.length()){
                min = w.length();
            }
            if(max < w.length()){
                max = w.length();
            }
        }

        System.out.println(max - min);
    }
}