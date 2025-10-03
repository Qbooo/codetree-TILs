import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int cnt = 0;
    public static int n;
    public static ArrayList<Integer> answer = new ArrayList<>();
    
    // currNum: 현재까지 사용한 자릿수
    public static void choose(int currNum) {
        // 정확히 N자리를 만들었을 때
        if(currNum == n) {
            cnt++;
            return;
        }
        // N자리를 초과하면 불가능
        if(currNum > n) {
            return;
        }
        
        // 1자리(1), 2자리(22), 3자리(333) 숫자 선택
        for(int i = 1; i <= 4; i++) {
            // i자리 숫자 추가
            choose(currNum + i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        choose(0);  // 0자리부터 시작
        
        System.out.print(cnt);
    }
}