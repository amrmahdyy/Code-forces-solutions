import java.util.Scanner;

public class A443 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine().toLowerCase();
        int[]distinct=new int[123];
        int count=0;
        for(int i=0;i<s.length();i++){
            int asci=(int)s.charAt(i);
            if(asci>=97 &&asci<123){

                if(distinct[asci]==0){
                    count++;
                }
                distinct[asci]++;
            }
        }
        System.out.println(count);
    }
}
