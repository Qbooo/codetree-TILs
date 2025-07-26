import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        boolean t = false;

        String a = s.nextLine();
        String b = s.nextLine();

        if((a+b).equals(b+a)){
            t = true;
        }

        System.out.println(t);
    }
}