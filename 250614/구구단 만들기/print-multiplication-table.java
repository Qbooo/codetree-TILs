import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for(int i = 1; i <= 9; i++){
            for(int j = b; j >= a; j--){
                if(j % 2 == 0){
                    System.out.print(j+" * "+i+" = "+j*i);
                    if(j >= a + 1){
                        System.out.print(" / ");
                    }
                }
            }
            System.out.println();
        }
    }
}