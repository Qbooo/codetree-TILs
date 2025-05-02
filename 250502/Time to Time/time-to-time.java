import java.util.Scanner;

public class Main {
     public static int changeToMin(int x){
        return x * 60;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.


    
        System.out.print((changeToMin(c)+d)-(changeToMin(a)+b));

    }
}