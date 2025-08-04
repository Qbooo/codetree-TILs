import java.util.Scanner;
public class Main {
    public static int ss(String a, String b){
        for(int i = 0; i <= a.length() -b.length(); i++){
            if(a.substring(i,i+b.length()).equals(b)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        System.out.print(ss(text, pattern));
    }
}