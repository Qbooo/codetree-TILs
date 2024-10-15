import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            list.add(num);
        }
        for(int i = 0; i < 5; i++){
            if(list.get(i)%3 != 0){
                System.out.println("0");
                System.exit(0);
            }
        }
        System.out.println("1");
    }
}