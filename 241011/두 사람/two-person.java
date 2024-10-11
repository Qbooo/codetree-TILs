import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner s = new Scanner(System.in);
        int age1 = s.nextInt();
        
        String sex1 = s.nextLine();
        int age2 = s.nextInt();
        
        String sex2 = s.nextLine();


        if(age1 >= 19 && sex1.equals(" M")||age2 >= 19 && sex2.equals(" M")){
            System.out.println("1");
        }
       
    }
}