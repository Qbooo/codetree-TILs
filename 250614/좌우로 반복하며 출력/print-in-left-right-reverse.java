import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            if(i%2==0){
                for(int j = 1; j <= n; j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j = n; j > 0; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}