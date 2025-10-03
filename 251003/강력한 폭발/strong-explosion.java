import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static final int MAX_N = 20;
    
    public static int n;
    public static int[][] grid = new int[MAX_N][MAX_N];  // 입력 격자 (0: 빈칸, 1: 폭탄 위치)
    public static int[][] bombGrid = new int[MAX_N][MAX_N];  // 폭탄 종류 저장 (1~3)
    public static boolean[][] exploded = new boolean[MAX_N][MAX_N];  // 폭발 범위
    public static ArrayList<Pair> bombPositions = new ArrayList<>();  // 폭탄을 놓아야 할 위치들
    public static int maxExploded = 0;
    
    // 폭탄 종류별 폭발 패턴
    public static int[][] bomb1 = {{-2, 0}, {-1, 0}, {0, 0}, {1, 0}, {2, 0}};
    public static int[][] bomb2 = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {0, 0}};
    public static int[][] bomb3 = {{-1, -1}, {-1, 1}, {0, 0}, {1, -1}, {1, 1}};
    
    static class Pair {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    
    // 폭발 범위 계산
    public static int calculateExploded() {
        // exploded 배열 초기화
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                exploded[i][j] = false;
            }
        }
        
        // 모든 폭탄 위치에 대해 폭발 범위 표시
        for(Pair pos : bombPositions) {
            int x = pos.x;
            int y = pos.y;
            int bombType = bombGrid[x][y];
            
            int[][] pattern;
            if(bombType == 1) {
                pattern = bomb1;
            } else if(bombType == 2) {
                pattern = bomb2;
            } else {
                pattern = bomb3;
            }
            
            // 패턴에 따라 폭발 범위 표시
            for(int k = 0; k < pattern.length; k++) {
                int nx = x + pattern[k][0];
                int ny = y + pattern[k][1];
                if(inRange(nx, ny)) {
                    exploded[nx][ny] = true;
                }
            }
        }
        
        // 폭발한 칸의 개수 세기
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(exploded[i][j]) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    // 각 폭탄 위치에 대해 1~3번 종류 선택 (백트래킹)
    public static void selectBombTypes(int idx) {
        // 모든 폭탄의 종류를 선택했을 때
        if(idx == bombPositions.size()) {
            int explodedCnt = calculateExploded();
            maxExploded = Math.max(maxExploded, explodedCnt);
            return;
        }
        
        Pair pos = bombPositions.get(idx);
        
        // 1번, 2번, 3번 폭탄 중 선택
        for(int bombType = 1; bombType <= 3; bombType++) {
            bombGrid[pos.x][pos.y] = bombType;
            selectBombTypes(idx + 1);
            bombGrid[pos.x][pos.y] = 0;  // 백트래킹 (사실 여기선 안해도 됨)
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // 격자 입력 + 폭탄 위치 찾기
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if(grid[i][j] == 1) {
                    bombPositions.add(new Pair(i, j));
                }
            }
        }
        
        // 각 폭탄 위치에 대해 종류 선택
        selectBombTypes(0);
        
        System.out.print(maxExploded);
    }
}