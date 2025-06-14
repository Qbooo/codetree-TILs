import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for(int i = 2; i <= 8; i = i+2){
            for(int j = b; j >= a; j--){
                System.out.print(j+" * "+i+" = "+j*i);
                if(j >= a + 1){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }

    }
}