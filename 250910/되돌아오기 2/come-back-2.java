import java.util.Scanner;
public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int x = 0, y = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int idx = 0;
        boolean back = false;
        for(int i = 0; i < commands.length(); i++){
            if(commands.charAt(i) == 'F'){
                x = x + dx[idx];
                y = y + dy[idx];
            }else if(commands.charAt(i) == 'R'){
                if(idx == 3){
                    idx = 0;
                }else{
                    idx = idx + 1;
                } 
            }else if(commands.charAt(i) == 'L'){
                if(idx == 0){
                    idx = 3;
                }else{
                    idx = idx - 1;
                }
            }
            if(x == 0 && y == 0){
                System.out.print(i+1);
                return;
            }
        }

        System.out.print(-1);
    }
}