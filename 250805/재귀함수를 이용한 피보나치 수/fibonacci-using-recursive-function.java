import java.util.Scanner;

public class Main {
    public static int p(int n){
        if(n == 1|| n == 2){
            return 1;
        }
        return p(n-1) + p(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(p(n));
    }
}