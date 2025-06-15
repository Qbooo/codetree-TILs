import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 65;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j < i){
                    System.out.print("  ");
                }
                else{
                    System.out.print((char)num+" ");
                    num++;
                    if(num == 91){
                        num = 65;
                    }
                }
            }
            System.out.println();
        }
    }
}