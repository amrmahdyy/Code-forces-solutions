import java.util.Arrays;
import java.util.Scanner;

public class A807 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int []beforeContest=new int[n];
        int[]afterContest=new int[n];
        for(int i=0;i<n;i++){
            beforeContest[i]=scanner.nextInt();
            afterContest[i]=scanner.nextInt();
        }
        boolean rated=false;

        for(int i=0;i<n;i++){
            if(beforeContest[i]!=afterContest[i]){
                rated=true;
                System.out.println("rated");
                return;
            }
        }
        int[]sortedContest=beforeContest.clone();
        Arrays.sort(sortedContest);
        boolean sorted=true;
        int index=0;
        for(int i=sortedContest.length-1;i>=0;i--){
            if(beforeContest[index++]!=sortedContest[i])sorted=false;
        }
        if(sorted) System.out.println("maybe");
        else System.out.println("unrated");
    }
}
