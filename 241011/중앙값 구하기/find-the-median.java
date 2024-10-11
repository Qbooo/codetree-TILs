import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int [] num = new int [3];
        num[0] = s.nextInt();
        num[1] = s.nextInt();
        num[2] = s.nextInt();
        Arrays.sort(num);
        
        System.out.println(num[1]);




    }
}