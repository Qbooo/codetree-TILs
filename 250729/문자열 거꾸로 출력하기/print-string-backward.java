import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);


        while(true){
            String w = s.nextLine();
            if(w.equals("END")){
                break;
            }
            String reversed = new StringBuilder(w).reverse().toString();
            System.out.println(reversed);

        }

    }
}