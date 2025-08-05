import java.util.Scanner;
public class Main {
    public static int n(int x, int cnt){
        if(x == 1){
            return cnt;
        }
        cnt++;
        if(x%2 == 0){
            return n(x/2, cnt);
        }
        else{
            return n(x/3, cnt);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(n(n, 0));
    }
}