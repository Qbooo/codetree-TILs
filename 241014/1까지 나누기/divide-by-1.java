import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        while(true){
            n = n/count;
            
            if(n <= 1){
                System.out.println(count);
                break;
            }
            count++;
        }

    }
}