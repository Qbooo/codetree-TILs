import java.util.Scanner;
public class Main {
    public static String weather(int y, int m, int d){
        if(m == 2){
            if(y%4 == 0){
                if(y % 100 == 0){
                    if(y%400 == 0){
                        if(d > 29){
                            return "-1";
                        }
                    }
                    if(d > 28){
                        return "-1";
                    }
                }else{
                    if(d > 29){
                        return "-1";
                    }
                }
            }else{
                if(d > 28){
                    return "-1";
                }
            }
        }
        if(m > 12){
            return "-1";
        }
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(d > 31){
                return "-1";
            }
        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            if(d > 30){
                return "-1";
            }
        }
        if(m >= 3 && m <= 5){
            return "Spring";
        }else if(m >= 6 && m <= 8){
            return "Summer";
        }else if(m >= 9 && m <= 11){
            return "Fall";
        }else if(m == 12 || m <= 2){
            return "Winter";
        }
        return "X";
            
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.print(weather(y, m, d));
    }
    
}