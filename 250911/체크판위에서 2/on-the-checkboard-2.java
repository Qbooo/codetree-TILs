import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
         long count = 0;
        char start = grid[0][0];
        char end = grid[R - 1][C - 1];

        // p1의 가능한 범위: 행 1..R-3, 열 1..C-3 (p2와 end를 위해 최소 공간 필요)
        for (int r1 = 1; r1 <= R - 3; r1++) {
            for (int c1 = 1; c1 <= C - 3; c1++) {
                // start -> p1 색이 달라야 함
                if (grid[r1][c1] == start) continue;

                // p2는 p1보다 아래쪽, 오른쪽에 있어야 하고 도착보다도 한 칸 위/왼쪽이어야 함
                for (int r2 = r1 + 1; r2 <= R - 2; r2++) {
                    for (int c2 = c1 + 1; c2 <= C - 2; c2++) {
                        // p1 -> p2 색이 달라야 하고 p2 -> end 색도 달라야 함
                        if (grid[r2][c2] == grid[r1][c1]) continue;
                        if (grid[r2][c2] == end) continue;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

}