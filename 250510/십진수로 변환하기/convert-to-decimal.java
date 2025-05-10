import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int n = binary.length();
        int[] two = new int[n];

        for (int i = 0; i < n; i++) {
            two[i] = Character.getNumericValue(binary.charAt(i));
        }
        int num = 0;

        for (int i = 0; i < n; i++){
            num = num * 2 + two[i];
        }

        System.out.println(num);

        

    }
}