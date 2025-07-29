import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w = s.nextLine();
        String r = "";

        for(int i = 0; i < w.length(); i++){
            if(w.charAt(i) >= 'a' && w.charAt(i) <= 'z'){
                r += (char)(w.charAt(i) - 'a' + 'A');
            }else if(w.charAt(i) >= 'A' && w.charAt(i) <= 'Z'){
                r += (char)(w.charAt(i) + 'a' - 'A');
            }
        }

        System.out.print(r);

    }
}