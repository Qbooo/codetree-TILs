import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int min = 999;
        int max = -999;
        int n = s.nextInt();

        while(n != 999 && n != -999){
            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
            n = s.nextInt();
        }
        System.out.println(max+" "+min);


    }
}