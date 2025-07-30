import java.util.Scanner;

public class Main {
    public static void min(int a, int b){
        int x = 0; 
        if( a >= b){
            x = a;
        }else if(b > a){
            x = b;
        }

        while(true){
            if(x%a == 0 && x%b == 0){
                System.out.print(x);
                break;
            }
            x++;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        min(n, m);
    }
}