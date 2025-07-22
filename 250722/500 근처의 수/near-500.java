import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            int num = s.nextInt();
            if(num < 500 && num >= max){
                max = num;
            }
            else if(num > 500 && num <= min){
                min = num;
            }
        }

        System.out.print(max+" "+min);

    }
}