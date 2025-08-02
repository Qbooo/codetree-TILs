import java.util.Scanner;
public class Main {
    public static int sum(int n){
        String x = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < x.length(); i++){
            sum += x.charAt(i) - '0';
        }
        return sum;
    }
    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    
    }
    public static boolean isPerfect(int n){
        if(isPrime(n) == true && sum(n)%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(isPerfect(i) == true){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}