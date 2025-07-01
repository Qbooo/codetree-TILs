import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        num[0] = s.nextInt();
        num[1] = s.nextInt();

        for(int i = 0; i < 8; i++){
            num[i+2] = (num[i] + num[i+1]) % 10;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(num[i]+" ");
        }
    }
}