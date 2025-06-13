import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = n; j >= 1; j--){
                System.out.print("("+i+","+j+") " );
            }
            System.out.println();
        }
    }
}