import java.util.*;
public class Main {
    public static int[][] grid = new int[200][200];
    public static int n;
    
    // 중력을 적용하는 함수
    public static void gravity(){
        // 각 열마다 중력 적용
        for(int col = 0; col < n; col++){
            int[] temp = new int[n];
            int idx = n - 1; // 아래에서부터 채우기
            
            // 아래에서 위로 올라가며 0이 아닌 값만 수집
            for(int row = n - 1; row >= 0; row--){
                if(grid[row][col] != 0){
                    temp[idx] = grid[row][col];
                    idx--;
                }
            }
            
            // 나머지는 0으로 채우기
            while(idx >= 0){
                temp[idx] = 0;
                idx--;
            }
            
            // 원본 배열에 다시 복사
            for(int row = 0; row < n; row++){
                grid[row][col] = temp[row];
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        int r = sc.nextInt() - 1; // 1-based → 0-based
        int c = sc.nextInt() - 1; // 1-based → 0-based
        
        int bomb = grid[r][c];
        
        // 폭탄 터뜨리기 - 상하좌우로 bomb 크기만큼
        // 세로 방향 (같은 열)
        for(int i = r - bomb + 1; i <= r + bomb - 1; i++){
            if(i >= 0 && i < n){
                grid[i][c] = 0;
            }
        }
        
        // 가로 방향 (같은 행)
        for(int j = c - bomb + 1; j <= c + bomb - 1; j++){
            if(j >= 0 && j < n){
                grid[r][j] = 0;
            }
        }
        
        // 중력 적용
        gravity();
        
        // 출력
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}