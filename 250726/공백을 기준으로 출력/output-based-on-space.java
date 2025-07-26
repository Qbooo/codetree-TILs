import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String w1 = s.nextLine();
        String w2 = s.nextLine();

        String w3 = w1 + w2;
        w3 = w3.replace(" ","");

        System.out.println(w3);
    }
}