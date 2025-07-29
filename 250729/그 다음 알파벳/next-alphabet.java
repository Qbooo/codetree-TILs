import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        char a = s.next().charAt(0);
        if(a == 'z'){
            System.out.print('a');
        }else{
            System.out.print((char)((int)a+1));
        }

    }
}