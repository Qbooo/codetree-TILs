import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n - 2; i++) {  // i+2 < n까지 flip 가능
            if (s[i] == 0) {
                count++;
                s[i] = 1 - s[i];
                s[i + 1] = 1 - s[i + 1];
                s[i + 2] = 1 - s[i + 2];
            }
        }

        // 전체 체크 (왼쪽은 이미 1, 오른쪽만 봐도 되지만 전체로 안전하게)
        boolean allOne = true;
        for (int i = 0; i < n; i++) {
            if (s[i] == 0) {
                allOne = false;
                break;
            }
        }

        if (allOne) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}