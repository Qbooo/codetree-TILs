import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        String aa = s.nextLine();
        String bb = s.nextLine();

        boolean ex = false;
        int index = 0;

        for(int i = 0; i < aa.length() - bb.length() + 1; i++){
            if(aa.substring(i,i+bb.length()).equals(bb)){
                System.out.print(i);
                ex = true;
                break;
            }
        }

        if(ex == false){
            System.out.println("-1");
        }

    }
}