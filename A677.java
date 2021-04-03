import java.util.Scanner;

public class A677 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int p=scanner.nextInt();
        int maxHeight=scanner.nextInt();
        int width=0;
        while(p--!=0){
            int height=scanner.nextInt();
            if(height>maxHeight)width+=2;
            else width++;
        }
        System.out.println(width);
    }
}
