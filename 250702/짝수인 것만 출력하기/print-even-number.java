import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] num = new int[n];
        int[] even = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = s.nextInt();
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            if(num[i]%2 == 0){
                even[j] = num[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++){
            System.out.print(even[i]+" ");
        }
    }
}