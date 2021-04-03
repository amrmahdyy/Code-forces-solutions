import java.util.Scanner;

public class A268 {
    public static void main(String[]args){
        // another soultion with time complex O(N)
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]home=new int[n];
        int []guest=new int[n];
        int counterArr[]=new int[101];
        int count=0;
        for(int i=0;i<n;i++){
            home[i]=scanner.nextInt();
            guest[i]=scanner.nextInt();
        }
        for(int i=0;i<home.length;i++)counterArr[home[i]]++;
        for(int j=0;j<guest.length;j++)if(counterArr[guest[j]]>0)count+=counterArr[guest[j]];
        System.out.println(count);
//        for(int i=0;i<n;i++){
//            int homeNum=scanner.nextInt();
//            counterArr[homeNum]++;
//            int guestNum=scanner.nextInt();
//            if(counterArr[guestNum]>0){
//                System.out.println(true);
//                count++;
//                counterArr[guestNum]++;
//            }
//
//        }


//        for(int i=0;i<home.length;i++){
//            int current=home[i];
//            for(int j=0;j<guest.length;j++){
//                if(guest[j]==current)count++;
//            }
//        }
//        System.out.println(count);
    }
}
