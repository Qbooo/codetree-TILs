import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum1=0;
        int sum2=0;
        for(int i = 0; i < m1 - 1; i++){
            sum1 += days[i];
        }
        sum1 = sum1+d1;
        for(int i = 0; i < m2 - 1; i++){
            sum2 += days[i];
        }
        sum2 = sum2 + d2;

        System.out.print(sum2 - sum1 + 1);
    }
}