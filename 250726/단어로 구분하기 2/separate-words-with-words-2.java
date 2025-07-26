import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            String w = s.next();
            if(i%2 == 0){
                System.out.println(w);
            }
        }

    }
}