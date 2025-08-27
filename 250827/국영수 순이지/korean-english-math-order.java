import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.korean == student.korean && this.english == student.english){
            return student.math - this.math;
        }
        if(this.korean == student.korean){
            return student.english - this.english;
        }
        return student.korean - this.korean;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.
        Student[] s = new Student[n];
        for(int i = 0; i < n; i++){
            s[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        Arrays.sort(s);
        for(int i = 0; i < n; i++){
            System.out.println(s[i].name+" "+s[i].korean+" "+s[i].english+" "+s[i].math);
        }
    }
}