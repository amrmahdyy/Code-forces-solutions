import java.util.Scanner;

public class A266 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        int firstPointer=0;
        int secPointer=1;
        int stones=0;
        while(secPointer<n){
            if(s.charAt(firstPointer)==s.charAt(secPointer))stones++;
            firstPointer++;secPointer++;
        }
        System.out.println(stones);
    }
}
