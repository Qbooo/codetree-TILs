import java.util.Scanner;

public class Main {
    static int[][] arr = new int[19][19];
    static int[] dx = {0, 1, 1, -1}; // →, ↓, ↘, ↗
    static int[] dy = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] == 0) continue; // 빈칸 건너뜀
                int color = arr[i][j];

                for (int d = 0; d < 4; d++) {
                    if (checkWin(i, j, d, color)) {
                        int cx = i + dx[d] * 2;
                        int cy = j + dy[d] * 2;
                        System.out.println(color);
                        System.out.println((cx + 1) + " " + (cy + 1));
                        return;
                    }
                }
            }
        }

        // 승자가 없으면
        System.out.println(0);
    }

    // 특정 위치(i, j)에서 방향 d로 시작해서 정확히 5목인지 확인
    static boolean checkWin(int i, int j, int d, int color) {
        int cnt = 1;

        // 앞으로 4칸 더 체크
        for (int k = 1; k < 5; k++) {
            int nx = i + dx[d] * k;
            int ny = j + dy[d] * k;
            if (!inRange(nx, ny)) return false;
            if (arr[nx][ny] == color) cnt++;
            else return false;
        }

        if (cnt != 5) return false;

        // 앞뒤 추가 같은 색 있으면 안 됨
        int px = i - dx[d], py = j - dy[d];
        int nx = i + dx[d] * 5, ny = j + dy[d] * 5;

        if (inRange(px, py) && arr[px][py] == color) return false;
        if (inRange(nx, ny) && arr[nx][ny] == color) return false;

        return true;
    }

    static boolean inRange(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}
