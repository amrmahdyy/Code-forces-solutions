import java.util.Scanner;

public class A71 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String []modifiedStrInArr=new String[n];
        int index=0;
        while((n--)!=0){
            String s=scanner.next();
            if(s.length()>10)
            modifiedStrInArr[index++]= s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
            else modifiedStrInArr[index++]=s;
        }
        for(String s:modifiedStrInArr) System.out.println(s);
    }
}
