import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 11;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num + j * 2+ " ");
            }
            num = num + 2;
            System.out.println();
        }
    }
}