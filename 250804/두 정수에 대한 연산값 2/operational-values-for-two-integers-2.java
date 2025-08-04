import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void a(AtomicInteger x, AtomicInteger y){
        if(x.get() >= y.get()){
            x.set(x.get()*2);
            y.set(y.get()+10);
        }else{
            x.set(x.get()+10);
            y.set(y.get()*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        AtomicInteger x = new AtomicInteger(a);
        AtomicInteger y = new AtomicInteger(b);
        a(x, y);
        System.out.print(x.get()+" "+y.get());
    }
}