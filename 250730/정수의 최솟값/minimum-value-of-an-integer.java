import java.util.Scanner;

public class Main {
    public static int min(int x, int y, int z){
        int min = Integer.MAX_VALUE;
        if(x < min){
            min = x;
        }
        if(y < min){
            min = y;
        }
        if(z < min){
            min = z;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(min(a, b, c));
    }
}