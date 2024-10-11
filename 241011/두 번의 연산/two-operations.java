import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a % 2 == 1){
            a = a+3;
        }
        if(a % 3 == 0){
            a = a/3;
        }

        System.out.println(a);
    }
}