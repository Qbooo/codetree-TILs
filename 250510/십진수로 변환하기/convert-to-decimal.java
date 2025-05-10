import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int n = binary.length();
        int[] two = new int[n];
        int num = 0;

        for(int i = 0; i < n; i++){
            num = num * 2 + (binary.charAt(i) - '0');
        }

        System.out.print(num);

    }
}