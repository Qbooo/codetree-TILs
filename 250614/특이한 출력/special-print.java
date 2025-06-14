import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if( (i + j)%4==0){
                System.out.println("("+i+", "+j+") ");
            }
            else{
             System.out.print("("+i+", "+j+") ");
            }
            
        }
    }

    }
}