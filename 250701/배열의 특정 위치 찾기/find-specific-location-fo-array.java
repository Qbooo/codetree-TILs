import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];

        for(int i = 0; i < 10; i++){
            num[i] = s.nextInt();
        }
        int even = num[1] + num[3] + num[5] + num[7] + num[9];
        double three = (num[2] + num[5] + num[8]) / 3.0;
        System.out.printf("%d %.1f", even , three);
    }
}