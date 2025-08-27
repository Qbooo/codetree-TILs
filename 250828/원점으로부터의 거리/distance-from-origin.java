import java.util.*;
class Point implements Comparable<Point>{
    int x;
    int y;
    int num;

    public Point(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Point p){
        if(Math.abs(this.x) + Math.abs(this.y) == Math.abs(p.x)+Math.abs(p.y)){
            return this.num - p.num;
        }
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(p.x)+Math.abs(p.y));
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            p[i] = new Point(points[i][0], points[i][1], i+1);
        }
        // Please write your code here.
        Arrays.sort(p);
        for(int i = 0; i < n; i++){
            System.out.println(p[i].num);
        }
    }
}