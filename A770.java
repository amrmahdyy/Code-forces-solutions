import java.util.Scanner;

public class A770 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        char []letters=new char[n];
        char start='a';
        int min=Math.min(k,26);
        for(int i=0;i<min;i++)letters[i]=(char)start++;
        int counter=n-k;
        while((counter--)!=0){

        }
//        for(int i=0;i<letters.length;i++) System.out.println(letters[i]);
    }
}
