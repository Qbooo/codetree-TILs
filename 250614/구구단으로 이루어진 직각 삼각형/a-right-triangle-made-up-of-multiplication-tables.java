import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= a; j++){
                if(j == a){
                    System.out.println(i+" * "+j+" = "+i*j);
                    a--;
                }
                else{
                     System.out.print(i+" * "+j+" = "+i*j+" / ");
                }
            }
        }
    }
}