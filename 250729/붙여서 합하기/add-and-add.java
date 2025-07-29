import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        int n = Integer.parseInt(a+b) + Integer.parseInt(b+a);

        System.out.print(n);

    }
}