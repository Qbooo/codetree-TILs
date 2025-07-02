import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int[] num = new int[100];

        num[0] = 1;
        num[1] = s.nextInt();
        System.out.print(1+" "+num[1]+" ");
        int i = 2;
        int ser = 0;
        while(ser < 100){
            num[i] = num[i - 1] + num[i - 2];
            ser = num[i];
            System.out.print(ser+" ");
            i++;
        }


    }
}