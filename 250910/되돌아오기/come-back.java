import java.util.Scanner;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int x = 0, y = 0;
    public static int direction(char a){
        if(a == 'E'){
            return 0;
        }else if(a == 'S'){
            return 1;
        }else if(a == 'W'){
            return 2;
        }else if(a == 'N'){
            return 3;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arive = false;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            for(int j = 0; j < dist; j++){
                x = x + dx[direction(dir)];
                y = y + dy[direction(dir)];
                cnt++;
                if(x == 0 && y == 0){
                    System.out.print(cnt);
                    arive = true;
                }
            }

            //int nx = x + dx[direction(dir)], ny = y + dy[direction(dir)];

        }

        if(arive == false){
            System.out.print(-1);
        }
        // Please write your code here.





    }
}