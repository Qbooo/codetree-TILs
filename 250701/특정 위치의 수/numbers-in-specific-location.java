import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < 10; i++){
            num[i] = s.nextInt();
        }

        System.out.println(num[2] + num[4]+ num[9]);
    }
}