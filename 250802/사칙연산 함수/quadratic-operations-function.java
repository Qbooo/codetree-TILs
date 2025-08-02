import java.util.Scanner;
public class Main {
    public static int math(int a, char c, int b){
        if(c == '+'){
            return a + b;
        }else if(c == '/'){
            return a / b;
        }else if(c == '-'){
            return a - b;
        }else if(c == '*'){
            return a * b;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if(o == '+' || o == '*' || o == '-' || o == '/'){
            System.out.print(a+" "+o+" "+c+" = "+math(a, o, c));
        }else{
            System.out.print("False");
        }
        
    }
}