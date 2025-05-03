import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int startDay = 0;
        int endDay = 0;
        int cnt = 0;
        int date = 0;

        if(A == "Mon"){
            date = 0;
        }
        else if(A == "Tue"){
            date = 1;
        }
         else if(A == "Wed"){
            date = 2;
        }
         else if(A == "Thu"){
            date = 3;
        }
         else if(A == "Fri"){
            date = 4;
        }
         else if(A == "Sat"){
            date = 5;
        }
         else if(A == "Sun"){
            date = 6;
        }

        

        for(int i = 0; i < m1-1; i++){
            startDay += days[i];
        }
        startDay = startDay + d1;

        for(int i = 0; i < m2-1; i++){
            endDay += days[i];
        }
        endDay = endDay + d2;

        cnt = (endDay - startDay) / 7;
        
        if((endDay-startDay)%7 < date){
            cnt = cnt - 1;
        }

        System.out.print(cnt);
    }
}