import java.util.Scanner;

public class A469 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]XAndY=new int[n+1];
        int x=scanner.nextInt();
        int index=0;
        while((x--!=0)){
            int input=scanner.nextInt();
            XAndY[input]++;
        }
        index=0;
        int y=scanner.nextInt();
        while((y--)!=0){
            int input=scanner.nextInt();
            XAndY[input]++;
        }
        for(int i=1;i<XAndY.length;i++){
            if(XAndY[i]==0){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}
