import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        String w = s.nextLine();

        w = w.replace(" ","");

        for(int i = 0; i < w.length(); i++){
            System.out.print(w.charAt(i));
            if((i+1)%5==0){
                System.out.println();
            }
        }

    }
}