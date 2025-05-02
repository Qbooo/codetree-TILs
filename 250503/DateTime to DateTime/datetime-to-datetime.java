import java.util.Scanner;
public class Main {
    public static int dayToMin(int x) {
        return x * 24 * 60;
    }
    public static int hourToMin(int x) {
        return x * 60;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int startMin = dayToMin(10)+hourToMin(10)+11;
        int endMin = dayToMin(A-1)+hourToMin(B-1)+C;

        System.out.print(endMin-startMin);
    }
}