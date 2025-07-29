import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String x = "";
        String y = "";

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                x += a.charAt(i);
            }
            else{
                break;
            }
        }

        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) >= '0' && b.charAt(i) <= '9'){
                y += b.charAt(i);
            }else{
                break;
            }
        }

        System.out.print(Integer.parseInt(x)+Integer.parseInt(y));

    }
}