import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        // Please write your code here.
        int[] team = {a, b, c, d, e};
        int[] onTeam = new int[5];
        int[] team1 = new int[2];
        int[] team2 = new int[2];
        boolean made = false;


        int minAnswer = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += team[i];
        }

        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                team1[0] = team[i];
                team1[1] = team[j];
                onTeam[i] = 1;
                onTeam[j] = 1;
                int team1Score = team1[0] + team1[1];
                
                for(int k = 0; k < 4; k++){
                    for(int v = k + 1; v < 5; v++){
                        if(onTeam[k] == 0 && onTeam[v] == 0 && team1Score != (team[k] + team[v])){
                            team2[0] = team[k];
                            team2[1] = team[v];
                            int team2Score = team2[0] + team2[1];
                            int team3Score = sum - team1Score - team2Score;
                            if(team3Score != team1Score && team3Score != team2Score){
                                made = true;
                                int max = Math.max(team1Score, Math.max(team2Score, team3Score));
                                int min = Math.min(team1Score, Math.min(team2Score, team3Score));

                                minAnswer = Math.min(minAnswer, max-min);
                            }



                        }
                    }
                }
                for(int k = 0; k < 5; k++){
                    onTeam[k] = 0;
                }
            }
        }
        if(!made){
            System.out.print(-1);
        }else{
            System.out.print(minAnswer);
        }
        
    }
}