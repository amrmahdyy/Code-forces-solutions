import java.util.Scanner;

public class A520{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] alphabets=new int[26];
        String s=scanner.next().toLowerCase();
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);
            int asci=(int)chr;
            alphabets[asci-97]++;
        }
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
