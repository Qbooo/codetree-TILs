import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();

        StringBuilder sb = new StringBuilder(a);
        int cnt = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (sb.charAt(i) != b.charAt(i)) {
                cnt++;
                for (int j = 0; j <= i; j++) {
                    char c = sb.charAt(j);
                    sb.setCharAt(j, c == 'G' ? 'H' : 'G');
                }
            }
            if (sb.toString().equals(b)) break;
        }

        System.out.println(sb.toString().equals(b) ? cnt : -1);
    }
}