import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int a = s.nextInt();
        for(int i = b; i >=a; i-=2){
            System.out.print(i+" ");
        }
    }
}