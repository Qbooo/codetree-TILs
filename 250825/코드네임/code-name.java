import java.util.Scanner;
class Agent{
    String name;
    int score;

    public Agent(String name, int score){
        this.name = name;
        this.score = score;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        Agent[] agents = new Agent[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int score = sc.nextInt();
            sc.nextLine();
            agents[i] = new Agent(name, score);
        }
        int x = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++){
            if(agents[i].score < min){
                min = agents[i].score;
                x = i;
            }
        }

        System.out.print(agents[x].name+" "+agents[x].score);

    }
}