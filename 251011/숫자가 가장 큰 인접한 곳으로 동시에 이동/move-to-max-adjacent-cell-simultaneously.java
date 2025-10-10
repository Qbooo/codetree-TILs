import java.util.Scanner;

public class Main {
    public static int n, m, t;
    public static int[][] grid = new int[21][21];
    public static int[][] count = new int[21][21];
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    // 구슬 이동 계산
    public static void moveMarbles() {
        int[][] nextCount = new int[21][21];
        int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우 (우선순위: 상 > 하 > 좌 > 우)
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count[i][j] == 0) continue;

                int maxVal = -1;
                int targetX = i;
                int targetY = j;

                // 상 > 좌 > 하 > 우 순으로 최대값과 위치 저장
                for (int d = 0; d < 4; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (inRange(ni, nj) && (grid[ni][nj] > maxVal)) {
                        maxVal = grid[ni][nj];
                        targetX = ni;
                        targetY = nj;
                    }
                }

                // 최대값이 격자 내에서 존재하면 이동, 없으면 제자리
                nextCount[targetX][targetY] += count[i][j];
            }
        }

        // 상태 업데이트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = nextCount[i][j];
            }
        }
    }

    // 충돌 처리
    public static void updateCount() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count[i][j] >= 2) {
                    count[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt() - 1; // 0-based
            marbles[i][1] = sc.nextInt() - 1;
            count[marbles[i][0]][marbles[i][1]]++; // 중복 위치는 문제 조건상 없음
        }

        // T번 시뮬레이션
        for (int time = 0; time < t; time++) {
            moveMarbles();
            updateCount();
        }

        // 남은 구슬 수 계산
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += count[i][j];
            }
        }
        System.out.println(ans);
    }
}