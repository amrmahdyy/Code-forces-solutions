import java.util.Arrays;
import java.util.Scanner;

public class A160 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]coins=new int[n];
        int index=0;
        int totalSum=0;
        while((n--)!=0){
            coins[index]=scanner.nextInt();
            totalSum+=coins[index];
            index++;
        }
        int avgSum=totalSum/2;
        Arrays.sort(coins);
        int minNumCoins=0;
        int currentKidHave=0;
        index=coins.length-1;
        while(currentKidHave<=avgSum){
            currentKidHave+=coins[index--];
            minNumCoins++;
        }
        System.out.println(minNumCoins);
    }
}
