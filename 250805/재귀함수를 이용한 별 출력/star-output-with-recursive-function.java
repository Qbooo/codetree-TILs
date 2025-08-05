import java.util.Scanner;
public class Main {
    public static void star(int x, int n){
        if(x == n + 1){
            return;
        }
        for(int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println();
        star(x+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        star(1, n);
    }
}