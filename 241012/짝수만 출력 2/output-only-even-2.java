import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int a = s.nextInt();

        int count = b;
        while(count >= a){
            System.out.print(count+" ");
            count = count - 2;
        }

    }
}