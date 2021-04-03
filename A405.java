import java.util.Scanner;

public class A405 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++)arr[i]=scanner.nextInt();
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                int temp=arr[i];
                arr[i]=min;
                arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
