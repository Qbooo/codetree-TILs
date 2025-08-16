import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        // 1부터 시작해서 재귀적으로 최소공배수 찾기
        int result = findLCM(arr, 1);
        System.out.println(result);
    }
    // 재귀 함수: num부터 시작해서 모든 배열 원소의 공배수를 찾음
    public static int findLCM(int[] arr, int num) {
        // 기저 조건: num이 모든 배열 원소로 나누어떨어지는지 확인
        if (isDivisibleByAll(arr, num)) {
            return num;
        }
        
        // 재귀 호출: num을 1 증가시켜서 다시 검사
        return findLCM(arr, num + 1);
    }
    
    // 보조 함수: num이 배열의 모든 원소로 나누어떨어지는지 확인
    public static boolean isDivisibleByAll(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}