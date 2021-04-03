import java.util.Scanner;

public class A231 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int solve=0;
        while(n--!=0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a+b+c>=2)solve++;
        }
        System.out.println(solve);

    }
}
