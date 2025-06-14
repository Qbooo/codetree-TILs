import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i%2==0){
                    cnt++;
                    System.out.print(cnt + " ");
                    
                }
                else{
                    cnt = cnt + 2;
                    System.out.print(cnt + " ");
                }
                

            }
            System.out.println();
        }

    }
}