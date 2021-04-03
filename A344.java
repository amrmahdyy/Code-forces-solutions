import java.util.Scanner;

public class A344 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int lastMagnet=scanner.nextInt();
        int count=1;
        while((--n)!=0){
            int magnet=scanner.nextInt();
            if(magnet!=lastMagnet){
                lastMagnet=magnet;
                count++;
            }

        }
        System.out.println(count);
    }
}
