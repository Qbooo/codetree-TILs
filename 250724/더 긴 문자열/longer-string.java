import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
         
        String n = s.next();
        String m = s.next();

        if(n.length() > m.length()){
            System.out.println(n+" "+n.length());
        }
        else if(n.length() < m.length()){
            System.out.println(m+" "+m.length());
        }
        else{
            System.out.println("same");
        }
    }
}