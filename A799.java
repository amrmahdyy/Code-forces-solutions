import java.util.Scanner;

public class A799 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int t=scanner.nextInt();
        int k=scanner.nextInt();
        int d=scanner.nextInt();
        double timeInSingleOven=(Math.ceil((double)n/(double)k))*t;
        int[]time=new int[1000];
        int firstOven=t;
        int secOven=d;
        int timeInDoubleOvens=0;
        boolean secOvenWorks=false;
        for(int i=1;i<time.length;i++){
//            System.out.println(secOvenWorks+" "+i+" "+secOven);
            if(n==0){
                timeInDoubleOvens=i-1;
                break;
            }
            if(secOvenWorks&& i%secOven==0 && n>0){
                secOven+=t;
                time[i]+=k;
                n-=k;
            }
            if((double)i/(double)d==1.0){
                secOven+=t;
              secOvenWorks=true;
            }
            if(i%firstOven==0&& n>0){
                firstOven+=t;
                time[i]+=k;
                n-=k;
            }

        }
//        for(int i=0;i<20;i++) System.out.print(time[i]+" ");
//        System.out.println();
//        System.out.println(timeInDoubleOvens);
        if(timeInDoubleOvens==0) System.out.println("NO");
        else{
            if(timeInSingleOven>timeInDoubleOvens) System.out.println("YES");
            else System.out.println("NO");
        }
//        double timeInTwoOven;
//         k=2*k;
////        if(t<d){
////            timeInTwoOven==
////        }
//
//        if(t>=d) {
//             timeInTwoOven = d + Math.ceil(n/k) * t;
//        }
//        else{
//             timeInTwoOven = d + Math.ceil(n/k) * t-d/t;
//        }
//        System.out.println(timeInSingleOven+" "+timeInTwoOven);
//        if(timeInSingleOven>timeInTwoOven) System.out.println("YES");
//        else System.out.println("NO");
    }
}
