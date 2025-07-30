import java.util.Scanner;

public class Main {
    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumPrime(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i) == true){
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(sumPrime(a, b));
    }
}