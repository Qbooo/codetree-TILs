import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < 2 * n + 1 ; i++){
            for(int j = 0; j < 2 * n + 1; j++){
                if(i%2==0 || j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}