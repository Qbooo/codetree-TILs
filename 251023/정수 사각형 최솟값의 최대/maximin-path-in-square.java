import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        // 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[n][n];
        
        // 초기화
        dp[0][0] = matrix[0][0];
        
        // 첫 번째 행
        for (int j = 1; j < n; j++) {
            dp[0][j] = Math.min(matrix[0][j], dp[0][j-1]);
        }
        
        // 첫 번째 열
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(matrix[i][0], dp[i-1][0]);
        }
        
        // DP 테이블 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                // 현재 위치와 상위/좌측 경로 중 최소값이 가장 큰 경로 선택
                dp[i][j] = Math.min(matrix[i][j], 
                                  Math.max(dp[i-1][j], dp[i][j-1]));
            }
        }
        
        System.out.println(dp[n-1][n-1]);
    }
}