import java.util.Scanner;

public class A427 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int officers=0;int untreated=0;
        while(n--!=0){
            int current=scanner.nextInt();
            if(current>-1)officers+=current;
            if(current==-1){
                if(officers!=0)officers--;
                else untreated++;
            }
        }
        System.out.println(untreated);
//        int []arr=new int[n];
//        for(int i=0;i<n;i++)arr[i]=scanner.nextInt();
//        for(int i=0;i<arr.length;i++){

//        }

    }
}
