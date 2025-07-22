import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        int max = 0;

        int n = s.nextInt();

        int[] price = new int[n];

        for(int i = 0; i < n; i++){
            price[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(price[j] - price[i] > max){
                    max = price[j] - price[i];
                }
            }
        }

        System.out.print(max);

    }
}