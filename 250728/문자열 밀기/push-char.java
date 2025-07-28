import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();

        w = w.substring(1,w.length()) + w.charAt(0);

        System.out.println(w);

    }
}