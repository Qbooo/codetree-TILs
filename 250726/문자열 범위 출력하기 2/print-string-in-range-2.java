import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        int n = s.nextInt();

        for(int i = w.length() - 1; i >= w.length() - n; i--){
            System.out.print(w.charAt(i));
        }

    }
}