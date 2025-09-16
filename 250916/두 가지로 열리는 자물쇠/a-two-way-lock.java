import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    // 첫 번째 자물쇠 확인
                    boolean first = distance(i, a, n) <= 2 && 
                                   distance(j, b, n) <= 2 && 
                                   distance(k, c, n) <= 2;
                    
                    // 두 번째 자물쇠 확인  
                    boolean second = distance(i, a2, n) <= 2 && 
                                    distance(j, b2, n) <= 2 && 
                                    distance(k, c2, n) <= 2;
                    
                    if(first || second){
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
    
    // 원형에서의 최소 거리 계산
    public static int distance(int x, int y, int n) {
        int diff = Math.abs(x - y);
        return Math.min(diff, n - diff);
    }
}