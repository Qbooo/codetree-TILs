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

        int maxArea2 = 0; // 삼각형 넓이의 2배

        // 세 점을 고르는 모든 경우
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // i, j, k 세 점 중 두 점이 같은 x 좌표, 다른 두 점이 같은 y 좌표일 때
                    if (x[i] == x[j] && y[i] == y[k]) {
                        int area2 = Math.abs(y[i] - y[j]) * Math.abs(x[i] - x[k]);
                        maxArea2 = Math.max(maxArea2, area2);
                    }
                    if (x[i] == x[k] && y[i] == y[j]) {
                        int area2 = Math.abs(y[i] - y[k]) * Math.abs(x[i] - x[j]);
                        maxArea2 = Math.max(maxArea2, area2);
                    }
                    if (x[j] == x[k] && y[j] == y[i]) {
                        int area2 = Math.abs(y[j] - y[k]) * Math.abs(x[j] - x[i]);
                        maxArea2 = Math.max(maxArea2, area2);
                    }
                }
            }
        }

        System.out.println(maxArea2);
    }
}
