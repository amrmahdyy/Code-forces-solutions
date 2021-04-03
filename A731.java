import java.util.Scanner;

public class A731 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        char []alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       String s=scanner.next();
//        int firstPointer=0;
//       int lastPointer=alphabets.length;
       int minimumCounter=0;
        int currentIndex=0;
        int current=(int)'a';
        int result = 0;
       for(int i=0;i<s.length();i++) {
//           char current=s.charAt(i);
//           int right=currentIndex;
//           int left=currentIndex;
//           int rightCounter=0;
//           int leftCounter=0;

           int n = 26;
//           System.out.println(Math.abs((int) s.charAt(i) - current)+" "+Math.abs((int)s.charAt(i)-current)-n);
           int min = Math.min(Math.abs((int) s.charAt(i) - current), n-Math.abs(((int) s.charAt(i)) - current));
           current = (int) s.charAt(i);
           result += min;


       }
        System.out.println(result);

//          while((n--)!=0){
//
////              if(alphabets[left]==current || alphabets[right]==current)break;
//              leftCounter++;
//              rightCounter++;
//              if(right>=26)left=0;
//              if(left<=0)right=25;
//              if(alphabets[left--]==current){
//                  System.out.println(true);
//                  minimumCounter+=leftCounter;
//              }
//              else if(alphabets[right++]==current){
//                  System.out.println(false);
//                  minimumCounter+=rightCounter;
//              }




//               if(alphabets[currentIndex]==current){
//                   System.out.println(current +" "+alphabets[currentIndex]);
//                   System.out.println(true);
//                   break;
//
//               }
//               else{
//                   rightCounter++;
//                   leftCounter++;
//                   left--;
//                   right++;
//                   if(left<=0)left=alphabets.length-1;
//                   if(right>=alphabets.length)right=0;
////                   System.out.println(left+" "+currentIndex+" "+right);
//                   if(alphabets[left]==current || alphabets[right]==current){
////                       System.out.println(true);
//                       if(rightCounter<leftCounter){
//                           minimumCounter+=rightCounter;
//                           currentIndex=right;
//                       }
//                       else{
//                           minimumCounter+=leftCounter;
//                           currentIndex=left;
//                       }
//                       break;
//                   }
//               }



//       }
//        System.out.println(minimumCounter);
    }
}
