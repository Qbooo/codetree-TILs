import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int [] num = new int [3];
        num[0] = a;
        if(b < a){
            num[0] = b;
            if(c < b){
                System.out.println(b);
            }
            else if(a < c){
                System.out.println(a);
            }
        }else if(c < a){
            System.out.println(a);
        }else if(c<b){
            System.out.println(c);
        }else if(b<c){
            System.out.println(b);
        }
        
    }
}