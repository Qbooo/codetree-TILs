import java.util.Scanner;
public class Main {
    public static int N(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return N(n/3) + N(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(N(n));

    }
}