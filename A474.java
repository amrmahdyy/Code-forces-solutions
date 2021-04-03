import java.util.Scanner;

public class A474 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        char move=scanner.next().charAt(0);
        String s=scanner.next();
        String keyboard="qwertyuiopasdfghjkl;zxcvbnm,./";
        int step=move=='L'?1:-1;
        String result="";
        for(int i=0;i<s.length();i++){
            char letterTyped=s.charAt(i);
            for(int j=0;j<keyboard.length();j++){
                if(keyboard.charAt(j)==letterTyped)result+=keyboard.charAt(j+step);
            }
        }
        System.out.println(result);
    }
}
