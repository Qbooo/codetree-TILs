import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int x = 0;
        int y = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == 'L'){
                if(idx == 0){
                    idx = 3;
                }else{
                    idx--;
                }
            }else if(a == 'R'){
                if(idx == 3){
                    idx = 0;
                }else{
                    idx++;
                }
            }else if(a == 'F'){
                x += dx[idx];
                y += dy[idx];
            }
        }

        System.out.print(x+" "+y);
    }
}