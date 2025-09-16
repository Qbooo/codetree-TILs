import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 조건들을 저장할 배열
        int[] guessNumbers = new int[n];
        int[] aHints = new int[n];
        int[] bHints = new int[n];
        
        // 입력 받기
        for(int i = 0; i < n; i++) {
            guessNumbers[i] = sc.nextInt();
            aHints[i] = sc.nextInt();
            bHints[i] = sc.nextInt();
        }
        
        int count = 0;
        
        // 모든 세자리 수 확인 (100~999)
        for(int answer = 100; answer <= 999; answer++) {
            boolean valid = true;
            
            // 모든 조건을 만족하는지 확인
            for(int i = 0; i < n; i++) {
                int guess = guessNumbers[i];
                int expectedA = aHints[i];
                int expectedB = bHints[i];
                
                // A 카운트: 자릿수와 위치가 모두 맞는 개수
                int actualA = countA(answer, guess);
                
                // B 카운트: 숫자는 있지만 위치가 다른 개수  
                int actualB = countB(answer, guess) - actualA;
                
                // 조건에 맞지 않으면 이 답은 불가능
                if(actualA != expectedA || actualB != expectedB) {
                    valid = false;
                    break;
                }
            }
            
            if(valid) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    // A 카운트: 같은 위치에 같은 숫자가 있는 개수
    public static int countA(int answer, int guess) {
        String ansStr = String.valueOf(answer);
        String guessStr = String.valueOf(guess);
        
        int count = 0;
        for(int i = 0; i < 3; i++) {
            if(ansStr.charAt(i) == guessStr.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    
    // 전체 공통 숫자 개수 (위치 무관)
    public static int countB(int answer, int guess) {
        String ansStr = String.valueOf(answer);
        String guessStr = String.valueOf(guess);
        
        int[] ansCount = new int[10];
        int[] guessCount = new int[10];
        
        // 각 숫자의 개수 세기
        for(int i = 0; i < 3; i++) {
            ansCount[ansStr.charAt(i) - '0']++;
            guessCount[guessStr.charAt(i) - '0']++;
        }
        
        // 공통 숫자 개수 계산
        int count = 0;
        for(int i = 0; i <= 9; i++) {
            count += Math.min(ansCount[i], guessCount[i]);
        }
        
        return count;
    }
}