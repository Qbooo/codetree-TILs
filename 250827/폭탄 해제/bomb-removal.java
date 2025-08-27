import java.util.Scanner;
class Bomb{
    String uCode;
    char lColor;
    int time;

    public Bomb(String uCode, char lColor, int time){
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }

    public void print(){
        System.out.println("code : " + uCode);
        System.out.println("color : " + lColor);
        System.out.println("second : " + time);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Bomb bomb = new Bomb(uCode, lColor, time);
        bomb.print();

    }
}