import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();
        double sum = 0;
        int age;
        while(true){
            age = scanner.nextInt();
            if(age > 29 || age < 20){
                for(Integer s : ages){
                    sum += s;
                    
                }
                double avg = sum/(ages.size());
                System.out.printf("%.2f", avg);
                break;
            }
            ages.add(age);
        }
    }
}