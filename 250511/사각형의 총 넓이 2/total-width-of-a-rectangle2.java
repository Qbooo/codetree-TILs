import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 2차원 평면: -100 ~ 100 → 0 ~ 200으로 매핑
        boolean[][] plane = new boolean[201][201];
        int size = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // 사각형 그리기
            for (int x = x1 + 100; x < x2 + 100; x++) {
                for (int y = y1 + 100; y < y2 + 100; y++) {
                    if (!plane[x][y]) { // 아직 그리지 않았으면
                        plane[x][y] = true; // 그린다
                        size++; // 넓이 증가
                    }
                }
            }
        }

        // 최종 넓이 출력
        System.out.println(size);
    }
}
