import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        String r1 = s.next();
        String r2 = s.next();

        r2 = r1.substring(0,2) + r2.substring(2,r2.length());

        System.out.println(r2);


    }
}