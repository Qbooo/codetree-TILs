import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                if(j%2 == 0 || j == 19){
                    System.out.println(i+" * "+j+" = "+i*j);
                }
                else{
                    System.out.print(i+" * "+j+" = "+i*j+" / ");
                }
            }
        }
    }
}