import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        System.out.println(w);
        for(int i = 0; i < w.length(); i++){
            w = w.charAt(w.length()-1) + w.substring(0,w.length()-1);
            System.out.println(w);
        }
    }
}