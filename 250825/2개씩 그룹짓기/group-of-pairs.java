import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(max < nums[i] + nums[2*n-1-i]){
                max = nums[i] + nums[2*n-1-i];
            }
        }

        System.out.print(max);

    }
}