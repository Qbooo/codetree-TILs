import java.util.*;
class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height && student.weight == this.weight){
            return this.num - student.num;
        }
        if(student.height == this.height){
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] sd = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            sd[i] = new Student(height[i], weight[i], i+1);
        }
        // Please write your code here.
        Arrays.sort(sd);
        for(int i = 0; i < n; i++){
            System.out.println(sd[i].height+" "+sd[i].weight+" "+sd[i].num);
        }
    }
}