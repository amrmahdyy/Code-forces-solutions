import java.util.Scanner;

public class A767 {
    static void swap(int i,int j,int[]arr){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
//        int counter=n;
        int[]candies=new int[n];
        for(int i=0;i<n;i++)candies[i]=scanner.nextInt();
        int[]hasCandies=new int[n+1];
        int next=n;
        for(int i=0;i<candies.length;i++){
            int current=candies[i];
            if(current==next){
                hasCandies[next]=1;
                while(hasCandies[next]!=0){
                    System.out.print(next+" ");
                    next--;
                }
                System.out.println();

            }
            else{
                hasCandies[current]=1;
                System.out.println();
            }
        }

//            if(size!=next&&hasCandies[next]!=0) {
//                System.out.println();
//                hasCandies[size]++;
//            }
//            else{
//                hasCandies[size]++;
//            }
//            for(int j=next;next>=0;j--){
//                if(hasCandies[j]==0)break;
//                else System.out.print(j+" ");
//            }
//            next--;
//        int []unsosortedCandies=candies.clone();
//        Arrays.sort(candies);
//        Collections.reverse(Arrays.asList(candies));
//        for(int i=0;i<unsosortedCandies.length;i++){
//            for(int j=i;j<candies.length;j++){
//                if(candies[i]==unsosortedCandies[j]){
//                    swap(i,j,unsosortedCandies);
//                    System.out.print(unsosortedCandies[j]+" ");
//                    break;
//                }
//                else System.out.println();
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(candies[i]!=n) System.out.println();
//            else{
//                for(int j=i;j>=0 && ;j--){
//                    System.out.print(candies[j]+" ");
//                    n--;
//                }
//            }
//        }
//        while((counter--)!=0){
//            int candy=scanner.nextInt();
//            if(candy!=n){
//                System.out.println();
//            }
//            else{
//                int left=n;
//                while((left--)>=n){
//                    System.out.println();
//                }
//            }
//        }
    }
}
