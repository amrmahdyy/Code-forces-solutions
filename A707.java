import java.util.Scanner;

public class A707 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        char[][]arr=new char[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scanner.next().charAt(0);
            }
        }
        boolean colored=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!='W' && arr[i][j]!='B' && arr[i][j]!='G'){
                    colored=true;
                }
            }
        }
        if(colored)System.out.println("#Color");
        else
        System.out.println("#Black&White");
    }
}
