import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            sum = 0;

            for(int j = a; j <= b; j++){
                if(j%2==0){
                    sum = sum + j;
                }
            }
            System.out.println(sum);

        }
    }
}