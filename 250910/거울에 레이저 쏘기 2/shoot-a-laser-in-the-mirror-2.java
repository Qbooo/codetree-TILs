import java.util.Scanner;

public class Main {
    static int x = 0, y = 0;
    static int dir = 0;
    static int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
    public static void xydir(int w, int num, int n){
        if(w == 0){
            x = 0;
            if(num - 1 == -1){
                num = n - 1;
            }else{
                num = num - 1;
            }
            y = num;
            dir = 2;
        }else if(w == 1){
            y = n - 1;
            if(num - 1 == -1){
                num = n - 1;
            }else{
                num = num - 1;
            }
            x = num;
            dir = 1;
        }else if(w == 2){
            x = n - 1;
            if(num != 0){
                num = n - num;
            }
            y = num;
            dir = 3;
        }else if(w == 3){
            y = 0;
            if(num != 0){
                num = n - num;
            }
            x = num;
            dir = 0;
        }
    }
    public static boolean isRange(int nx, int ny, int n){
        return (0 <= nx && nx < n && 0 <= ny && ny < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.

        int w = startNum / 4;
        int num = startNum % n;
        int cnt = 1;
        xydir(w, num, n);
        while(true){
             //System.out.println(">>>>>>> "+x+","+y+"dir>>>" + dir);

            int nx, ny;
            if(grid[x][y]=='/'){
                dir = 3 - dir;
                nx = x + dx[dir];
                ny = y + dy[dir];
                if(isRange(nx, ny, n)){
                    cnt++;
                    x = nx;
                    y = ny;
                }else{
                    System.out.print(cnt);
                    return;
                }

            }else{
                if(dir == 2){
                    dir = 0;
                }else if(dir == 0){
                    dir = 2;
                }else if(dir == 1){
                    dir = 3;
                }else if(dir == 3){
                    dir = 1;
                }
                nx = x + dx[dir];
                ny = y + dy[dir];
                if(isRange(nx, ny, n)){
                    cnt++;
                    x = nx;
                    y = ny;
                }else{
                    System.out.print(cnt);
                    return;
                }

               
            }


        }


    }
}