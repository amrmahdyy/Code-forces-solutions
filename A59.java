import java.util.Scanner;

public class A59 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int uppCaseCounter=0;
        int lowCaseCounter=0;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97)lowCaseCounter++;
            else uppCaseCounter++;
        }
        System.out.println(lowCaseCounter>=uppCaseCounter?s.toLowerCase():s.toUpperCase());

    }
}
