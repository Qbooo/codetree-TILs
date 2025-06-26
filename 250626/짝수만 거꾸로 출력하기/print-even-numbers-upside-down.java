import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = s.nextInt();
        }

        for(int i = n-1; i >= 0; i--){
            if(nums[i]%2 == 0){
                System.out.print(nums[i]+" ");
            }
        }
    }
}