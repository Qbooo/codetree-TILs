import java.util.Scanner;
public class Main {
    public static int n, m, t;
    public static int[][] grid = new int[21][21];
    public static int[][] count = new int[21][21];
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
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
            int r = sc.nextInt() - 1; // 0-based로 변환
            int c = sc.nextInt() - 1;
            count[r][c]++;
        }

        int[] dx = {-1, 0, 1, 0}; // 상 좌 하 우 (순서 상관 없음)
        int[] dy = {0, -1, 0, 1};

        for (int time = 0; time < t; time++) {
            int[][] nextCount = new int[21][21]; // 다음 상태 초기화

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (count[i][j] == 0) continue;

                    int maxV = -1;
                    int targetX = -1;
                    int targetY = -1;
                    int numMax = 0;

                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (inRange(ni, nj)) {
                            int v = grid[ni][nj];
                            if (v > maxV) {
                                maxV = v;
                                targetX = ni;
                                targetY = nj;
                                numMax = 1;
                            } else if (v == maxV) {
                                numMax++;
                            }
                        }
                    }

                    if (numMax == 1 && maxV > grid[i][j]) {
                        // 이동
                        nextCount[targetX][targetY] += count[i][j];
                    } else {
                        // stay
                        nextCount[i][j] += count[i][j];
                    }
                }
            }

            // 충돌 처리: >=2면 0으로
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (nextCount[i][j] >= 2) {
                        count[i][j] = 0;
                    } else {
                        count[i][j] = nextCount[i][j];
                    }
                }
            }
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