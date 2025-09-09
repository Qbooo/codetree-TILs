import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.

            int[] dx = {distance, -distance, 0, 0};
            int[] dy = {0, 0, -distance, distance};

            if(direction == 'E'){
                x = x + dx[0];
                y = y + dy[0];
            }else if(direction == 'W'){
                x = x + dx[1];
                y = y + dy[1];
            }else if(direction == 'S'){
                x = x + dx[2];
                y = y + dy[2];
            }else if(direction == 'N'){
                x = x + dx[3];
                y = y + dy[3];
            }

        }

        System.out.print(x+" "+y);
    }
}