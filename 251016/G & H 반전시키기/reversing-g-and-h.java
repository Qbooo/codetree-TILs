import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        // Please write your code here.
        int[] nums = new int[a.length()];
        int cnt = 0;

        for(int i = 0; i < a.length(); i++){
            if(b.charAt(i) == a.charAt(i)){
                nums[i] = 0;
            } else{
                nums[i] = 1;
            }
        }

        if(nums[0] == 1){
            cnt++;
        }
        for(int i = 1; i < a.length(); i++){
            if(nums[i-1] == 0 && nums[i] == 1){
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}