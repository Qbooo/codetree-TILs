import java.util.Scanner;
public class Main {
    public static int fk(int n){
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 4;
        }

        return (fk(n - 1) * fk(n - 2)) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(fk(n));
    }
}