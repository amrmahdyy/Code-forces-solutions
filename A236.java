import java.util.Scanner;

public class A236 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int[]asciArr=new int[123];
        int distinctCounter=0;
        for(int i=0;i<s.length();i++){
            int index=(int)s.charAt(i);
            if(asciArr[index]==0)distinctCounter++;
            asciArr[index]++;
        }
        if(distinctCounter%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

//        char []arrChrs=new char[s.length()];
//        arrChrs=s.toCharArray();
//       Arrays.sort(arrChrs);
//       String sorted=new String(arrChrs);
//        int counter=0;
//        for(int i=0;i<sorted.length()-1;i++){
//            if(sorted.charAt(i)!=sorted.charAt(i+1))++counter;
//        }
//        counter++;


    }
}
