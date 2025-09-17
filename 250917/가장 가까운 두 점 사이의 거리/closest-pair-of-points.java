import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;

        // 모든 두 점 쌍 거리 제곱을 구해 최소값 찾기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                int dist = dx * dx + dy * dy;
                minDist = Math.min(minDist, dist);
            }
        }

        System.out.println(minDist);
    }
}
