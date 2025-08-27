import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int sc1;
    int sc2;
    int sc3;

    public Student(String name, int sc1, int sc2, int sc3){
        this.name = name;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    @Override
    public int compareTo(Student student){
        return (this.sc1+this.sc2+this.sc3) - (student.sc1+student.sc2+student.sc3);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sd = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            sd[i] = new Student(name, score1, score2, score3);

        }
        // Please write your code here.

        Arrays.sort(sd);
        for(int i = 0; i < n; i++){
            System.out.println(sd[i].name+" "+sd[i].sc1+" "+sd[i].sc2+" "+sd[i].sc3);
        }
    }
}