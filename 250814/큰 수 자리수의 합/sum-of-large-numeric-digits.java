import java.util.Scanner;
public class Main {
    public static int three(int sum, int d){
        if(d < 10){
            return sum + d;
        }
        sum += d%10;
        d = d / 10;
        return three(sum, d);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.print(three(0, a* b* c));

    }
}