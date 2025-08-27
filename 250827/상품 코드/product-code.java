import java.util.Scanner;
class Product{
    String id2;
    int code2;

    public Product(String id2, int code2){
        this.id2 = id2;
        this.code2 = code2;
    }

    public Product(){
        id2 = "codetree";
        code2 = 50;
    }

    public void print(){
        System.out.println("product " + code2 + " is " + id2);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product p = new Product();
        Product p2 = new Product(id2, code2);

        p.print();
        p2.print();
    }
}