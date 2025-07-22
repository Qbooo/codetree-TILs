import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        int n = s.nextInt();

        int[] nums = new int[n];
        int a = 0;

        for(int i = 0; i < n; i++){
            nums[i] = s.nextInt();
        }
        int count = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                a = Math.abs(nums[j] - nums[i]);
                if(a < min){
                    min = a;
                }
            }
        }

        System.out.print(min);


    }
}