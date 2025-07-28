import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        int loop = w.length() - 1;

        for(int i = 0; i < loop; i++){
            
            int n = s.nextInt();
            s.nextLine();
            if(n >= w.length()){
                w = w.substring(0,w.length()-1);
            }else{
                w = w.substring(0,n) + w.substring(n+1,w.length());
            }
            System.out.println(w);
        }

    }
}