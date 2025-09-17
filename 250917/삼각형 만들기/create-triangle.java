import java.util.Scanner;

public class Main {
    // 세 점으로 만들 수 있는 "넓이 * 2" (직각이면서 한 변이 x축 평행, 다른 한 변이 y축 평행인 경우)
    // 가능한 모든 경우(각각의 점을 직각 꼭짓점으로)를 검사한다.
    public static long calcArea2(int x1, int y1, int x2, int y2, int x3, int y3) {
        long area = 0;

        // point1이 직각 꼭짓점인 경우
        if (x1 == x2 && y1 == y3) area = Math.max(area, (long)Math.abs(y1 - y2) * Math.abs(x1 - x3));
        if (x1 == x3 && y1 == y2) area = Math.max(area, (long)Math.abs(y1 - y3) * Math.abs(x1 - x2));

        // point2가 직각 꼭짓점인 경우
        if (x2 == x1 && y2 == y3) area = Math.max(area, (long)Math.abs(y2 - y1) * Math.abs(x2 - x3));
        if (x2 == x3 && y2 == y1) area = Math.max(area, (long)Math.abs(y2 - y3) * Math.abs(x2 - x1));

        // point3가 직각 꼭짓점인 경우
        if (x3 == x1 && y3 == y2) area = Math.max(area, (long)Math.abs(y3 - y1) * Math.abs(x3 - x2));
        if (x3 == x2 && y3 == y1) area = Math.max(area, (long)Math.abs(y3 - y2) * Math.abs(x3 - x1));

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        long maxArea2 = 0;

        // 삼중 루프: i < n-2, j < n-1, k < n 으로 쓸모없는 반복 줄임
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long area2 = calcArea2(x[i], y[i], x[j], y[j], x[k], y[k]);
                    if (area2 > maxArea2) maxArea2 = area2;
                }
            }
        }

        System.out.println(maxArea2);
    }
}
