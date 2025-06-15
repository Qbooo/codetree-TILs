import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}