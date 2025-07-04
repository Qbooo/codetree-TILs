import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int max = 0;

        for(int i = 0; i < 10; i++){
            int n = s.nextInt();
            if(n > max){
                max = n;
            }
        }

        System.out.println(max);

    }
}