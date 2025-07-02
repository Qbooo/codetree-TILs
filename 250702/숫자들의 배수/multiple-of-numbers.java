import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;
        int cnt = 0;

        while(cnt < 2){
            System.out.print(n*i+" ");
            if(n*i%5 == 0){
                cnt++;
            }
            i++;
        }
    }
}