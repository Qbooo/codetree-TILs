import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print("*");
            }
            for(int j = n; j > n-i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}