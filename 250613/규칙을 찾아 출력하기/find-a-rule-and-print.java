import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("* ");
                }
                else if(i <= j){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}