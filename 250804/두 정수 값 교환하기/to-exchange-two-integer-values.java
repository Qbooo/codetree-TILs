import java.util.Scanner;
class IntWrapper {
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void sw(IntWrapper x, IntWrapper y){
        int t = x.value;
        x.value = y.value;
        y.value = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntWrapper x = new IntWrapper(n);
        IntWrapper y = new IntWrapper(m);
        sw(x, y);

        System.out.print(x.value+" "+y.value);
    }
}