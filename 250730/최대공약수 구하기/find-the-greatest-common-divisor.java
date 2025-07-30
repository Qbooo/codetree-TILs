import java.util.Scanner;

public class Main {
    public static void max(int a, int b){
        int x = 0;
        if(a > b){
            x = a;
        }else if(b >= a){
            x = b;
        }
        for(int i = x; i >= 0; i--){
            if(a%i == 0 && b%i == 0){
                System.out.print(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        max(n, m);
    }
}