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
                // [0, i] 범위 반전
                for (int j = 0; j <= i; j++) {
                    if (sb.charAt(j) == 'G') {
                        sb.setCharAt(j, 'H');
                    } else {
                        sb.setCharAt(j, 'G');
                    }
                }
            }
            if (sb.toString().equals(b)) {
                break;
            }
        }

        // 최종 확인
        if (sb.toString().equals(b)) {
            System.out.println(cnt);
        } else {
            System.out.println(-1); // 문제 조건상 불필요할 수도
        }
    }
}