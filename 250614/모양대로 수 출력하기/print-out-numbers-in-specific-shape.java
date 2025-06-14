import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = n; j > 0; j--){
                if(i < j){
                    System.out.print("  ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}