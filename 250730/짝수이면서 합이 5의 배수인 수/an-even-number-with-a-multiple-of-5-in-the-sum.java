import java.util.Scanner;
public class Main {
    public static void cheak(int n){
        int a = n/10 + n%10;
        if(n%2 == 0 && a%5 == 0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        cheak(n);
    }
}