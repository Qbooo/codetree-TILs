import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        final int OFFSET = 100000;     // 좌표 [-100000, 100000]
        final int SIZE = 200001;

        short[] w = new short[SIZE];   // 흰 칠 횟수 (short이면 충분)
        short[] b = new short[SIZE];   // 검 칠 횟수
        byte[] last = new byte[SIZE];  // 0=없음, 1=흰, 2=검
        boolean[] grey = new boolean[SIZE];

        int m = OFFSET;                // 현재 위치(점)

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') { // [m, m+x)
                for (int j = m; j < m + x; j++) {
                    if (grey[j]) continue;
                    b[j]++;
                    if (w[j] >= 2 && b[j] >= 2) {
                        grey[j] = true;        // 회색 고정
                    } else {
                        last[j] = 2;           // 마지막 색 = 검
                    }
                }
                m += x;
            } else { // 'L' → (m-x, m] == [m-x, m)
                for (int j = m - 1; j >= m - x; j--) {
                    if (grey[j]) continue;
                    w[j]++;
                    if (w[j] >= 2 && b[j] >= 2) {
                        grey[j] = true;        // 회색 고정
                    } else {
                        last[j] = 1;           // 마지막 색 = 흰
                    }
                }
                m -= x;
            }
        }

        int cntW = 0, cntB = 0, cntG = 0;
        for (int i = 0; i < SIZE; i++) {
            if (grey[i]) cntG++;
            else if (last[i] == 1) cntW++;
            else if (last[i] == 2) cntB++;
        }

        System.out.println(cntW + " " + cntB + " " + cntG);
    }
}
