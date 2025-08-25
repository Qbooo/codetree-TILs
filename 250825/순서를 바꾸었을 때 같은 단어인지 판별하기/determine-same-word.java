import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] aa = word1.toCharArray();
        char[] bb = word2.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);

        if(Arrays.equals(aa, bb)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}