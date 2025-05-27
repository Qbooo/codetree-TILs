public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner s = new Scanner(System.in);

        int n = s.nextInt()

        for(int i = n; i > 0; i--){
            if(i%2 == 1){
                for(int j = i; j > 0; j--) {
                    System.out.print("* ")
                }
            }
            else {
                for(int j = 0; j < i; j++) {
                    System.out.print("* ")
                }
            }
        }
    }
}