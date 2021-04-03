import java.util.Scanner;

public class A263 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int result=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int input=scanner.nextInt();
                if(input==1)result=(Math.abs(i-3)+Math.abs(j-3));
            }
        }
        System.out.println(result);
    }
}
