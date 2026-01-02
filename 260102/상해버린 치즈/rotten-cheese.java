import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());


       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int D = Integer.parseInt(st.nextToken());
       int S = Integer.parseInt(st.nextToken());

       int[][] ate = new int[D][3];
       int[][] sick = new int[S][2]; // 수정: sick은 [사람, 시간] 2개만 필요

       for(int i = 0; i < D; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            ate[i][0] = p;
            ate[i][1] = m;
            ate[i][2] = t;
       }


       for(int i = 0; i < S; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            sick[i][0] = p;
            sick[i][1] = t;
       }

        
        int maxMedicine = 0;

        // 각 치즈(1~M)가 상했다고 가정
        for(int cheese = 1; cheese < M + 1; cheese++){
            boolean isPossible = true;
            
            // 검증: 모든 아픈 사람이 이 치즈를 아프기 전에 먹었는가?
            for(int i = 0; i < S; i++){
                int sickPerson = sick[i][0];
                int sickTime = sick[i][1];
                
                boolean ateThisCheese = false;
                
                // 이 아픈 사람이 해당 치즈를 아프기 전에 먹었는지 확인
                for(int j = 0; j < D; j++){
                    if(ate[j][0] == sickPerson && 
                       ate[j][1] == cheese && 
                       ate[j][2] < sickTime){
                        ateThisCheese = true;
                        break;
                    }
                }
                
                // 아픈 사람이 이 치즈를 안 먹었거나 아픈 시간 이후에 먹었다면
                // 이 치즈는 상한 치즈가 아님
                if(!ateThisCheese){
                    isPossible = false;
                    break;
                }
            }
            
            // 이 치즈가 상한 치즈 후보라면
            if(isPossible){
                // 이 치즈를 먹은 사람들 세기 (중복 제거)
                Set<Integer> peopleAte = new HashSet<>();
                for(int j = 0; j < D; j++){
                    if(ate[j][1] == cheese){
                        peopleAte.add(ate[j][0]);
                    }
                }
                maxMedicine = Math.max(maxMedicine, peopleAte.size());
            }
        }

        System.out.println(maxMedicine);
    }
}