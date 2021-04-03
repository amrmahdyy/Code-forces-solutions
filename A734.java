import java.util.Scanner;

public class A734 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String winner=scanner.next();
        int antonScore=0;
        int danikScore=0;
        for(int i=0;i<winner.length();i++){
            if(winner.charAt(i)=='A')antonScore++;
            else danikScore++;
        }
        if(antonScore>danikScore) System.out.println("Anton");
        else if(antonScore<danikScore) System.out.println("Danik");
        else System.out.println("Friendship");

    }
}
