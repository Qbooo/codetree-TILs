import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int n = s.nextInt();

    for(int i = 0; i < n; i++){
        a = a + n;
        System.out.println(a);
    }
    }
}