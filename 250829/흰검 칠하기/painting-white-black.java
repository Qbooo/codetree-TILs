import java.util.*;

public class Main {
    static final int MAX_MOVE = 100000;        // N*x ≤ 1000*100
    static final int OFFSET = MAX_MOVE;
    static final int SIZE = 2 * MAX_MOVE + 5;  // [-100000,100000] + 여유

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 칠해진 횟수와 상태
        short[] w = new short[SIZE];   // 흰색 칠한 횟수
        short[] b = new short[SIZE];   // 검은색 칠한 횟수
        byte[]  last = new byte[SIZE]; // 0:없음, 1:흰, 2:검
        boolean[] gray = new boolean[SIZE]; // 회색 확정 여부

        int m = 0; // 현재 위치(논리 좌표, 시작 0)

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                // [m, m+x)  → 타일 m..m+x-1
                for (int pos = m; pos < m + x; pos++) {
                    int idx = pos + OFFSET;
                    if (gray[idx]) continue;

                    b[idx]++;                  // 검은색 한번 더
                    if (w[idx] >= 2 && b[idx] >= 2) {
                        gray[idx] = true;      // 두 색각각 2번 이상 → 회색 고정
                    } else {
                        last[idx] = 2;         // 아직 회색 아니면 마지막 색 = 검
                    }
                }
                m = m + x - 1;                 // 마지막 칠한 타일 위로 이동
            } else { // 'L'
                // [m-x+1, m+1) → 현재 타일 포함해 왼쪽 x칸
                for (int pos = m; pos > m - x; pos--) {
                    int idx = pos + OFFSET;
                    if (gray[idx]) continue;

                    w[idx]++;                  // 흰색 한번 더
                    if (w[idx] >= 2 && b[idx] >= 2) {
                        gray[idx] = true;
                    } else {
                        last[idx] = 1;         // 아직 회색 아니면 마지막 색 = 흰
                    }
                }
                m = m - x + 1;
            }
        }

        int W = 0, B = 0, G = 0;
        for (int i = 0; i < SIZE; i++) {
            if (gray[i]) G++;
            else if (last[i] == 1) W++;
            else if (last[i] == 2) B++;
        }
        System.out.println(W + " " + B + " " + G);
    }
}
