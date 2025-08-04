import java.util.Scanner;
public class Main {
    public static String palindrome(String a){
        String b = "";
        for(int i = a.length() - 1; i >= 0; i--){
            b += a.charAt(i);
        }
        if(a.equals(b)){
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.print(palindrome(input));

    }
}