import java.util.Scanner;
class A{
    String id;
    int level;

    public A (){
        this.id = "codetree";
        this.level = 10;
    }

    public A(String id, int level){
        this.id = id;
        this.level = level;
    }

    public void print(){
        System.out.println("user "+id+" lv "+level);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        
        A a = new A();
        A b = new A(id, level);
        a.print();
        b.print();
    }
}