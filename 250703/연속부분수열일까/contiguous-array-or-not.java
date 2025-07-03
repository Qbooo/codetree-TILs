import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = s.nextInt();
        }

        boolean isSubarray = false;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isSubarray = true;
                break;
            }
        }

        System.out.println(isSubarray ? "Yes" : "No");
    }
}
