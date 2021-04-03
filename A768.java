import java.util.Scanner;

public class A768 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long[]arr=new long[n];
        int index=0;
        while((n--)!=0)arr[index++]=scanner.nextLong();
//        Arrays.sort(arr);
        long min=arr[0];
        long max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])min=arr[i];
            if(max<arr[i])max=arr[i];
        }
        int count=0;
        for(int i=0;i<arr.length;i++)if(arr[i]>min &&arr[i]<max)count++;
        System.out.println(count);
    }
}
