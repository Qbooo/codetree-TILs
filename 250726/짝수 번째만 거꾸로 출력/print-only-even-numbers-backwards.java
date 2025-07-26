import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();

        for(int i = w.length() - 1; i >= 0; i--){
            if(i%2 == 1){
                System.out.print(w.charAt(i));
            }
        }

    }
}