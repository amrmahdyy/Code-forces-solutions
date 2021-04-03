import java.util.Scanner;

public class A318 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        long middle=0;
        if(n%2==0)middle=n/2;
        else if(n%2!=0)middle=(n/2)+1;
        long startEven=middle+1;
        long equationResult=0;
        if(k>middle){
             equationResult=((k-startEven)+1)*2;
        }
        else if(k<=middle){
             equationResult=(2*k)-1;
        }
        System.out.println(equationResult);
    }
}
