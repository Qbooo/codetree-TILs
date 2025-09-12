import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;

        // 3개 수 고르기 (완전 탐색)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (noCarry(arr[i], arr[j], arr[k])) {
                        ans = Math.max(ans, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    // carry 발생 여부 체크 함수
    static boolean noCarry(int a, int b, int c) {
        String sa = new StringBuilder(String.valueOf(a)).reverse().toString();
        String sb = new StringBuilder(String.valueOf(b)).reverse().toString();
        String sc = new StringBuilder(String.valueOf(c)).reverse().toString();

        int maxLen = Math.max(sa.length(), Math.max(sb.length(), sc.length()));

        for (int i = 0; i < maxLen; i++) {
            int da = (i < sa.length()) ? sa.charAt(i) - '0' : 0;
            int db = (i < sb.length()) ? sb.charAt(i) - '0' : 0;
            int dc = (i < sc.length()) ? sc.charAt(i) - '0' : 0;
            if (da + db + dc >= 10) return false; // carry 발생
        }
        return true; // carry 없음
    }
}
