import java.util.Scanner;

public class A686 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long iceCreams=scanner.nextLong();
        char []signs=new char[n];
        String[]iceCreamsArr=new String[n];
        int index=0;
        int distressed=0;
        while((n--)!=0){
           signs[index]=scanner.next().charAt(0);
            iceCreamsArr[index]=scanner.next();
            index++;
        }
        for(int i=0;i<iceCreamsArr.length;i++){
            long currentIceCream=Long.parseLong(iceCreamsArr[i]);
            if((signs[i])=='+')iceCreams+=currentIceCream;
            else if(signs[i]=='-'){
                if( currentIceCream<=iceCreams){
                    iceCreams-=currentIceCream;
                }
                else distressed++;
            }
        }
        System.out.println(iceCreams);
        System.out.println(distressed);
    }
}
