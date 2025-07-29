import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();

        int sum = 0;

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) >= '0' && w.charAt(i) <= '9'){
                sum += (int)w.charAt(i) - '0';
            }
        }

        System.out.print(sum);

    }
}