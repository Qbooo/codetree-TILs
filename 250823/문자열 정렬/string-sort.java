import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String newa = new String(a);
        System.out.print(newa);
    }
}