import java.util.Scanner;

public class A431 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=4;
        int []calArr=new int[n];
        for(int i=0;i<calArr.length;i++)calArr[i]=scanner.nextInt();
        String s=scanner.next();
        char secsArr[]=new char[s.length()];
        secsArr=s.toCharArray();
        int calCounter=0;
        for(int i=0;i<secsArr.length;i++){
            int index=(Integer.parseInt(Character.toString(secsArr[i])))-1;
            calCounter+=calArr[index];
        }
        System.out.println(calCounter);
    }
}
