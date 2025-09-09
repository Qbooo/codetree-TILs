import java.util.*;

class Man {
    int k;
    int num;
    boolean sick = false;

    public Man(int k, int num) {
        this.k = k;
        this.num = num;
    }
}

public class Main {
    static Man[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // time
            shakes[i][1] = sc.nextInt(); // x
            shakes[i][2] = sc.nextInt(); // y
        }

        // 시간순 정렬 (동일 시간은 입력 순서 유지 - Arrays.sort는 안정 정렬)
        Arrays.sort(shakes, Comparator.comparingInt(o -> o[0]));

        a = new Man[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Man(K, i + 1);
        }
        a[P-1].sick = true;

        // 각 악수 이벤트 처리: "악수 시작 직전"의 감염 상태를 기준으로 처리
        for (int i = 0; i < T; i++) {
            int x = shakes[i][1];
            int y = shakes[i][2];

            // 시작 시점 상태를 복사
            boolean xWasSick = a[x-1].sick;
            boolean yWasSick = a[y-1].sick;

            boolean xInfects = false;
            boolean yInfects = false;

            // 감염자였던 사람만 k를 소모하고(감염 횟수로 간주),
            // 상대가 아직 감염되지 않았을 때만 '새로 감염' 표시를 한다.
            if (xWasSick && a[x-1].k > 0) {
                a[x-1].k--;
                if (!yWasSick) xInfects = true;
            }
            if (yWasSick && a[y-1].k > 0) {
                a[y-1].k--;
                if (!xWasSick) yInfects = true;
            }

            // 위에서 결정된 '새로 감염될 사람' 적용
            if (xInfects) a[y-1].sick = true;
            if (yInfects) a[x-1].sick = true;
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(a[i].sick ? 1 : 0);
        }
    }
}
