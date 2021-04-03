import java.util.Scanner;

public class A381 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)arr[i]=scanner.nextInt();
        int turn=0;
        int serejaScore=0;
        int dimaScore=0;
        int leftPointer=0;
        int rightPointer=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int chosenCard=0;
            if(arr[leftPointer]>arr[rightPointer]){
                chosenCard+=arr[leftPointer];
                leftPointer++;
            }
            else{
                chosenCard+=arr[rightPointer];
                rightPointer--;
            }
            if(++turn%2!=0){
                serejaScore+=chosenCard;
            }
            else dimaScore+=chosenCard;
        }
        System.out.println(serejaScore);
        System.out.println(dimaScore);
    }
}
