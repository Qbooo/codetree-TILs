import java.util.Scanner;
class Weather{
    String date;
    String day;
    String weather;
    boolean rain;

    public Weather(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
        rain = false;
    }



}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] w = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            w[i] = new Weather(date, day, weather);

        }

        for(int i = 0; i < n; i++){

            if(w[i].weather.equals("Rain")){
                w[i].rain = true;
            }
        }

        // 비 오는 날 중 가장 빠른 날짜 찾기
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (w[i].rain) {
                if (idx == -1 || w[i].date.compareTo(w[idx].date) < 0) {
                    idx = i;
                }
            }
        }

        // 출력: 날짜 요일 날씨
        if (idx != -1) {
            System.out.println(w[idx].date + " " + w[idx].day + " " + w[idx].weather);
        }
    }
}