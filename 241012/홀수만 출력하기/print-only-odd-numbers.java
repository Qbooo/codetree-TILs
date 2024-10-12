import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            int c = s.nextInt();
            nums.add(c);
        }

        for(Integer v : nums){
            if(v%2 == 1 && v%3 == 0){
                System.out.println(v);
            }
        }
    }
}