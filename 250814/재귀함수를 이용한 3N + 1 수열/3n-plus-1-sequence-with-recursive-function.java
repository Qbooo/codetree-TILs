import java.util.Scanner;
public class Main {
    public static int n(int cnt, int n){
        if(n == 1){
            return cnt;
        }
        if(n%2 == 0){
            n = n / 2;
        }
        else{
            n = n * 3 + 1;
        }
        cnt++;
        return n(cnt, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(n(0, n));
    }
}