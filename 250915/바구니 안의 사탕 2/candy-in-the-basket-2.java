import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        int[] basket = new int[101];  // 위치 0~100

        // 입력 처리: 각 바구니 위치에 사탕 누적
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
            basket[positions[i]] += candies[i];
        }

        int max = 0;

        // 중심 위치 c를 0~100으로 이동하며 최대 사탕 계산
        for (int c = 0; c <= 100; c++) {
            int sum = 0;

            // [c-K, c+K] 범위 합산
            for (int j = c - k; j <= c + k; j++) {
                if (j >= 0 && j <= 100) {  // 배열 범위 벗어나면 무시
                    sum += basket[j];
                }
            }

            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}
