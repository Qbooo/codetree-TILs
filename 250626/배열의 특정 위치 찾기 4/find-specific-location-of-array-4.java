import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++){
            nums[i] = s.nextInt();
        }
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                break;
            }
            if(nums[i] % 2 == 0){
                cnt++;
                sum += nums[i];
            }
            
        }

        System.out.printf("%d %d", cnt, sum);

    }
}