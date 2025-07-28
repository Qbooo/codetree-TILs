import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.next();

        String r = w.substring(0,1) + w.substring(2,w.length()-2)+w.substring(w.length()-1,w.length());

        System.out.print(r);

    }
}