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

        int startMin = dayToMin(11)+hourToMin(11)+11;
        int endMin = dayToMin(A)+hourToMin(B)+C;

        if(endMin-startMin < 0){
            System.out.print("-1");
        }else{
            System.out.print(endMin-startMin);
        }
    }
}