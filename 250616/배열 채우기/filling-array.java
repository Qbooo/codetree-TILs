import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[10];
        int count = 0;

        // 입력 받기
        for(int i = 0; i < 10; i++) {
            int input = s.nextInt();
            if(input == 0) break;
            nums[count++] = input;
        }

        // 거꾸로 출력
        for(int i = count - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
