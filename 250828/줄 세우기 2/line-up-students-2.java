import java.util.*;
class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight =weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student sd){
        if(this.height == sd.height){
            return sd.weight - this.weight;
        }
        return this.height - sd.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sd = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            sd[i] = new Student(height, weight, i+1);
        }
        // Please write your code here.
        Arrays.sort(sd);
        for(int i = 0; i < n; i++){
            System.out.println(sd[i].height+" "+sd[i].weight+" "+sd[i].num);
        }
    }
}