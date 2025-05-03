import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int startDays = 0;
        for(int i = 0; i < m1 - 1; i++){
            startDays = startDays + month[i];
        }
        startDays = startDays - month[m1-1] + d1;

        int endDays = 0;
        for(int i = 0; i < m2 - 1; i++){
            endDays = endDays + month[i];
        }
        endDays = endDays - month[m2-1] + d2;
        int diffDays = endDays - startDays;

        if(diffDays < 0){
            diffDays = -1 * diffDays;
            if(diffDays%7 == 0){
                System.out.print("Mon");
            }
            else if(diffDays%7 == 1){
                System.out.print("Sun");
            }
            else if(diffDays%7 == 2){
                System.out.print("Sat");
            }
            else if(diffDays%7 == 3){
                System.out.print("Fri");
            }
            else if(diffDays%7 == 4){
                System.out.print("Thu");
            }
            else if(diffDays%7 == 5){
                System.out.print("Wed");
            }
            else if(diffDays%7 == 6){
                System.out.print("The");
            }
            else{
                System.out.print("error");
            }
        }

        else{

            if(diffDays%7 == 0){
                System.out.print("Mon");
            }
            else if(diffDays%7 == 1){
                System.out.print("Tue");
            }
            else if(diffDays%7 == 2){
                System.out.print("Wed");
            }
            else if(diffDays%7 == 3){
                System.out.print("Thu");
            }
            else if(diffDays%7 == 4){
                System.out.print("Fri");
            }
            else if(diffDays%7 == 5){
                System.out.print("Sat");
            }
            else if(diffDays%7 == 6){
                System.out.print("Sun");
            }
            else{
                System.out.print("error");
            }
        }

    }
}