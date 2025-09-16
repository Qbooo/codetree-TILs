import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 힌트 정보 저장
        int[][] guesses = new int[N][3];  // B의 질문들
        int[] strikes = new int[N];       // 1번 카운트 (스트라이크)
        int[] balls = new int[N];         // 2번 카운트 (볼)
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            guesses[i][0] = num / 100;           // 백의 자리
            guesses[i][1] = (num / 10) % 10;     // 십의 자리  
            guesses[i][2] = num % 10;            // 일의 자리
            strikes[i] = sc.nextInt();           // 1번 카운트
            balls[i] = sc.nextInt();             // 2번 카운트
        }
        
        // 가능한 모든 세 자리 수 검사
        int count = 0;
        
        // 1~9에서 서로 다른 3개 숫자 선택 (완전탐색)
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (b == a) continue;  // 서로 다른 숫자
                for (int c = 1; c <= 9; c++) {
                    if (c == a || c == b) continue;  // 서로 다른 숫자
                    
                    // 현재 후보 [a, b, c]가 모든 힌트를 만족하는지 검사
                    boolean valid = true;
                    for (int i = 0; i < N; i++) {
                        int[] result = calculateStrikeBall(
                            new int[]{a, b, c}, guesses[i]);
                        
                        if (result[0] != strikes[i] || result[1] != balls[i]) {
                            valid = false;
                            break;
                        }
                    }
                    
                    if (valid) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
    
    // 스트라이크와 볼 계산 함수
    public static int[] calculateStrikeBall(int[] secret, int[] guess) {
        int strike = 0;
        int ball = 0;
        
        // 스트라이크 계산 (같은 자리에 같은 숫자)
        for (int i = 0; i < 3; i++) {
            if (secret[i] == guess[i]) {
                strike++;
            }
        }
        
        // 볼 계산 (다른 자리에 있는 같은 숫자)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && secret[i] == guess[j]) {
                    ball++;
                }
            }
        }
        
        return new int[]{strike, ball};
    }
}