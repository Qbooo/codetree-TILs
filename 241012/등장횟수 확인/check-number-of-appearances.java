import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            nums.add(n);
        }
        int count = 0;
        for(Integer s : nums){
            if(s%2 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}