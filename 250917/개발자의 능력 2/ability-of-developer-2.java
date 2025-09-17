import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ability1 = sc.nextInt();
        int ability2 = sc.nextInt();
        int ability3 = sc.nextInt();
        int ability4 = sc.nextInt();
        int ability5 = sc.nextInt();
        int ability6 = sc.nextInt();
        // Please write your code here.
        int[] team = {ability1, ability2, ability3, ability4, ability5, ability6};
        int[] onTeam = new int[6];
        int[] team1 = new int[2];
        int[] team2 = new int[2];
        int[] team3 = new int[2];


        int minAnswer = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < 6; i++){
            sum += team[i];
        }

        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 6; j++){
                team1[0] = team[i];
                team1[1] = team[j];
                onTeam[i] = 1;
                onTeam[j] = 1;
                for(int k = 0; k < 5; k++){
                    for(int v = k + 1; v < 6; v++){
                        if(onTeam[k] == 0 && onTeam[v] == 0){
                            team2[0] = team[k];
                            team2[1] = team[v];
                            int team1Score = team1[0] + team1[1];
                            int team2Score = team2[0] + team2[1];
                            int team3Score = sum - team1Score - team2Score;

                            int max = Math.max(team1Score, Math.max(team2Score, team3Score));
                            int min = Math.min(team1Score, Math.min(team2Score, team3Score));

                            minAnswer = Math.min(minAnswer, max-min);


                        }
                    }
                }
                for(int k = 0; k < 6; k++){
                    onTeam[k] = 0;
                }
            }
        }

        System.out.print(minAnswer);

    }
}