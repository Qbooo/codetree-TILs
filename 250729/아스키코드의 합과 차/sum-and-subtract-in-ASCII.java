import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        char a = s.next().charAt(0);
        char b = s.next().charAt(0);

        System.out.println((int)a + (int)b+" "+Math.abs((int)a-(int)b));

    }
}