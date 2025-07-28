import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();

        w = w.substring(0,1) + "a" + w.substring(2,w.length()-2) + "a" + w.substring(w.length()-1,w.length());
        System.out.print(w);

    }
}