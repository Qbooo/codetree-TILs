import java.util.Scanner;

public class Main {
    public static int ab(int a, int b){
        int x = a;
        for(int i = 0; i < b - 1; i++){
            x = x * a;
        }

        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(ab(a, b));

    }
}